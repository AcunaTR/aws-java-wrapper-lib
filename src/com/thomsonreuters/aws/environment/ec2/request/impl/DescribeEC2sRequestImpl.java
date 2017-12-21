package com.thomsonreuters.aws.environment.ec2.request.impl;

import com.amazonaws.services.ec2.model.DescribeInstancesRequest;
import com.thomsonreuters.aws.environment.ec2.request.IDescribeEC2sRequest;

public class DescribeEC2sRequestImpl implements IDescribeEC2sRequest, IDescribeEC2sRequestRaw{

	private final DescribeInstancesRequest _req;
	
	public DescribeEC2sRequestImpl() {
		_req = new DescribeInstancesRequest();
	}

	@Override
	public DescribeInstancesRequest getRaw() {
		return _req;
	}
	
	
	
	
}