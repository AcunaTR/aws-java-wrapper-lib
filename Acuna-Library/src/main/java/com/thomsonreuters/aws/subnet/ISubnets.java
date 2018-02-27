package com.thomsonreuters.aws.subnet;

public interface ISubnets {

	boolean containsId(String subnetId);
	boolean isEmpty();
	int size();
	ISubnet get(int idx);
	
}
