/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomsonreuters.aws.environment.impl;

import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2ClientBuilder;
import com.thomsonreuters.aws.ami.wrappers.IAmis;
import com.thomsonreuters.aws.ami.wrappers.impl.AmisImpl;
import com.thomsonreuters.aws.ec2.impl.EC2Impl;
import com.thomsonreuters.aws.ec2.wrappers.IEC2s;
import com.thomsonreuters.aws.environment.IEnv;
import com.thomsonreuters.aws.environment.ami.request.IDescribeAmiRequest;
import com.thomsonreuters.aws.environment.ami.request.impl.raw.IDescribeRequestRaw;

/**
 *
 * @author U6067157
 */
public class EnvImpl implements IEnv {
	    
	    private final AmazonEC2 _ec2;
	    
	    public EnvImpl() {
	        _ec2 = AmazonEC2ClientBuilder.defaultClient();
	    }
	    
	    @Override
	    public IAmis describeAmis(IDescribeAmiRequest request) {
	        IDescribeRequestRaw raw = (IDescribeRequestRaw)request;
	        return new AmisImpl(_ec2.describeImages(raw.getRaw()).getImages());
	    }


	    @Override
	    public IEC2s describeEC2s(IDescribeEC2Request request) {
	        IDescribeRequestRaw raw = (IDescribeRequestRaw)request;
	        return new EC2Impl(_ec2.describeImages(raw.getRaw()).getImages());
	    }
}

