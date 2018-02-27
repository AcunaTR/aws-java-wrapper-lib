package com.thomsonreuters.aws.environment.ec2;

import com.thomsonreuters.aws.ami.IAmis;
import com.thomsonreuters.aws.environment.ec2.request.interfaces.IDescribeAmisRequest;
import com.thomsonreuters.aws.environment.ec2.request.interfaces.IDescribeEC2sRequest;
import com.thomsonreuters.aws.environment.ec2.request.interfaces.IDescribeLaunchTemplatesRequest;
import com.thomsonreuters.aws.environment.ec2.request.interfaces.IDescribeSubnetsRequest;
import com.thomsonreuters.aws.environment.ec2.request.interfaces.ILaunchEC2sRequest;
import com.thomsonreuters.aws.environment.ec2.request.interfaces.ITerminateInstancesRequest;
import com.thomsonreuters.aws.launchtemplate.ILaunchTemplates;
import com.thomsonreuters.aws.reservation.IReservation;
import com.thomsonreuters.aws.reservation.IReservations;
import com.thomsonreuters.aws.subnet.ISubnets;

public interface IEC2Env  {

    IAmis describeAmis(IDescribeAmisRequest request);

    IReservations describeEC2s(IDescribeEC2sRequest request);
    
    void terminateInstances(ITerminateInstancesRequest req);
    
    IReservation launchEC2s(ILaunchEC2sRequest req);

	ILaunchTemplates describeTemplates(IDescribeLaunchTemplatesRequest request);
	
	ISubnets describeSubnets(IDescribeSubnetsRequest req);
}
