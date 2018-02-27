package com.thomsonreuters.aws.environment.ec2.request.interfaces;

import java.util.List;

public interface IDescribeSubnetsRequest {
	
	public void setSubnetIds(List<String> subnetIds);
	public void setSubnetId(String subnetId);
	public List<String> getSubnetIds();
	
}
