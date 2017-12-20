/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomsonreuters.aws.environment.impl;

import java.util.ArrayList;
import java.util.List;

import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2ClientBuilder;
import com.amazonaws.services.ec2.model.Instance;
import com.amazonaws.services.ec2.model.Reservation;
import com.thomsonreuters.aws.ami.IAmis;
import com.thomsonreuters.aws.ami.impl.AmisImpl;
import com.thomsonreuters.aws.ec2.IEC2s;
import com.thomsonreuters.aws.ec2.impl.EC2sImpl;
import com.thomsonreuters.aws.environment.IEC2Env;
import com.thomsonreuters.aws.environment.request.ami.IDescribeAmisRequest;
import com.thomsonreuters.aws.environment.request.ami.IDescribeAmisRequestRaw;
import com.thomsonreuters.aws.environment.request.ec2.IDescribeEC2sRequest;
import com.thomsonreuters.aws.environment.request.ec2.IDescribeEC2sRequestRaw;

/**
 *
 * @author U6067157
 */
public class EC2EnvImpl implements IEC2Env {
	    
	    private final AmazonEC2 _ec2;
	    
	    public EC2EnvImpl() {
	        _ec2 = AmazonEC2ClientBuilder.defaultClient();
	    }
	    
	    @Override
	    public IAmis describeAmis(IDescribeAmisRequest request) {
	        IDescribeAmisRequestRaw raw = (IDescribeAmisRequestRaw)request;
	        return new AmisImpl(_ec2.describeImages(raw.getRaw()).getImages());
	    }


	    @Override
	    public IEC2s describeEC2s(IDescribeEC2sRequest request) {
	        IDescribeEC2sRequestRaw raw = (IDescribeEC2sRequestRaw)request;
	        List<Reservation> resList = _ec2.describeInstances(raw.getRaw()).getReservations();
	        List<Instance> instances = new ArrayList<>();
	        for (Reservation res : resList) {
	        	instances.addAll(res.getInstances());
	        }
	        return new EC2sImpl(instances);
	    }
}

