package com.thomsonreuters.aws.environment.request.ec2;

import com.amazonaws.services.ec2.model.DescribeInstancesRequest;

public interface IDescribeEC2sRequestRaw {

	DescribeInstancesRequest getRaw();

}
