package com.thomsonreuters.aws.environment.ec2.request.impl;

import java.util.Arrays;
import java.util.List;

import com.amazonaws.services.ec2.model.DescribeImagesRequest;
import com.amazonaws.services.ec2.model.DescribeSubnetsRequest;
import com.thomsonreuters.aws.environment.ec2.request.impl.raw.IDescribeAmisRequestRaw;
import com.thomsonreuters.aws.environment.ec2.request.impl.raw.IDescribeSubnetsRequestRaw;
import com.thomsonreuters.aws.environment.ec2.request.interfaces.IDescribeSubnetsRequest;

public class DescribeSubnetsRequestImpl implements IDescribeSubnetsRequest, IDescribeSubnetsRequestRaw {

	private DescribeSubnetsRequest _req;
	
	public DescribeSubnetsRequestImpl() {
		_req = new DescribeSubnetsRequest();
	}
	
	@Override
	public void setSubnetIds(List<String> subnetIds) {
		_req.setSubnetIds(subnetIds);

	}

	@Override
	public void setSubnetId(String subnetId) {
		_req.setSubnetIds(Arrays.asList(subnetId));
	}

	@Override
	public List<String> getSubnetIds() {
		return _req.getSubnetIds();
	}

	@Override
	public DescribeSubnetsRequest getRaw() {
		return _req;
	}

}
