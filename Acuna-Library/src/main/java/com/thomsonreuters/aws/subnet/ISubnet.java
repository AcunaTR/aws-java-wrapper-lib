package com.thomsonreuters.aws.subnet;

public interface ISubnet {
	
	String getSubnetId();
	int getAvailableIpAddresses();
	String getVPCId();
	
}
