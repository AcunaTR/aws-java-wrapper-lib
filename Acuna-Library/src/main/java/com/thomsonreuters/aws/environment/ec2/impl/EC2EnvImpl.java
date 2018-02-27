/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomsonreuters.aws.environment.ec2.impl;

import java.util.List;

import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2ClientBuilder;
import com.amazonaws.services.ec2.model.DescribeLaunchTemplatesResult;
import com.amazonaws.services.ec2.model.DescribeSubnetsResult;
import com.amazonaws.services.ec2.model.LaunchTemplate;
import com.amazonaws.services.ec2.model.RunInstancesResult;
import com.thomsonreuters.aws.ami.Amis;
import com.thomsonreuters.aws.ami.IAmis;
import com.thomsonreuters.aws.environment.ec2.IEC2Env;
import com.thomsonreuters.aws.environment.ec2.request.impl.raw.IDescribeAmisRequestRaw;
import com.thomsonreuters.aws.environment.ec2.request.impl.raw.IDescribeEC2sRequestRaw;
import com.thomsonreuters.aws.environment.ec2.request.impl.raw.IDescribeLaunchTemplatesRequestRaw;
import com.thomsonreuters.aws.environment.ec2.request.impl.raw.IDescribeSubnetsRequestRaw;
import com.thomsonreuters.aws.environment.ec2.request.impl.raw.ILaunchEC2sRequestRaw;
import com.thomsonreuters.aws.environment.ec2.request.impl.raw.ITerminateInstancesRequestRaw;
import com.thomsonreuters.aws.environment.ec2.request.interfaces.IDescribeAmisRequest;
import com.thomsonreuters.aws.environment.ec2.request.interfaces.IDescribeEC2sRequest;
import com.thomsonreuters.aws.environment.ec2.request.interfaces.IDescribeLaunchTemplatesRequest;
import com.thomsonreuters.aws.environment.ec2.request.interfaces.IDescribeSubnetsRequest;
import com.thomsonreuters.aws.environment.ec2.request.interfaces.ILaunchEC2sRequest;
import com.thomsonreuters.aws.environment.ec2.request.interfaces.ITerminateInstancesRequest;
import com.thomsonreuters.aws.launchtemplate.ILaunchTemplates;
import com.thomsonreuters.aws.launchtemplate.impl.LaunchTemplatesImpl;
import com.thomsonreuters.aws.reservation.IReservation;
import com.thomsonreuters.aws.reservation.IReservations;
import com.thomsonreuters.aws.reservation.impl.ReservationImpl;
import com.thomsonreuters.aws.reservation.impl.ReservationsImpl;
import com.thomsonreuters.aws.subnet.ISubnets;
import com.thomsonreuters.aws.subnet.impl.SubnetsImpl;

/**
 *
 * @author U6067157
 */
public class EC2EnvImpl implements IEC2Env {
	    
    private final AmazonEC2 _env;

    public EC2EnvImpl() {
        _env = AmazonEC2ClientBuilder.defaultClient();
    }

    @Override
    public IAmis describeAmis(IDescribeAmisRequest request) {
        IDescribeAmisRequestRaw raw = (IDescribeAmisRequestRaw)request;
        return Amis.create(_env.describeImages(raw.getRaw()).getImages());
    }

    @Override
    public IReservations describeEC2s(IDescribeEC2sRequest request) {
        IDescribeEC2sRequestRaw raw = (IDescribeEC2sRequestRaw)request;
        return new ReservationsImpl(_env.describeInstances(raw.getRaw()).getReservations());
    }

    @Override
    public void terminateInstances(ITerminateInstancesRequest req) {
        ITerminateInstancesRequestRaw raw = (ITerminateInstancesRequestRaw) req;
        _env.terminateInstances(raw.getRaw());
    }

    @Override
    public String toString() {
        return _env.toString();
    }

    @Override
    public IReservation launchEC2s(ILaunchEC2sRequest req) {
        ILaunchEC2sRequestRaw raw = (ILaunchEC2sRequestRaw) req;
        RunInstancesResult res = _env.runInstances(raw.getRaw());
        return new ReservationImpl(res.getReservation());
    }
    
    @Override
    public ILaunchTemplates describeTemplates(IDescribeLaunchTemplatesRequest request) {
    	IDescribeLaunchTemplatesRequestRaw raw = (IDescribeLaunchTemplatesRequestRaw) request;
    	DescribeLaunchTemplatesResult result = _env.describeLaunchTemplates(raw.getRaw());
    	List<LaunchTemplate> templates = result.getLaunchTemplates();
		return new LaunchTemplatesImpl(templates);
    }

	@Override
	public ISubnets describeSubnets(IDescribeSubnetsRequest req) {
		IDescribeSubnetsRequestRaw raw = (IDescribeSubnetsRequestRaw) req;
		DescribeSubnetsResult result = _env.describeSubnets(raw.getRaw());
		return new SubnetsImpl(result.getSubnets());
	}    	
}
