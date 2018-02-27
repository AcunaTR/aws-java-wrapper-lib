package com.thomsonreuters.aws.subnet.impl;

import com.amazonaws.services.ec2.model.Subnet;
import com.thomsonreuters.aws.subnet.ISubnet;

public class SubnetImpl implements ISubnet{

	private Subnet _subnet;
	
	public SubnetImpl(Subnet subnet) {
		_subnet = subnet;
	}
	
	@Override
	public String getSubnetId() {
		return _subnet.getSubnetId();
	}

	@Override
	public int getAvailableIpAddresses() {
		return _subnet.getAvailableIpAddressCount();
	}

	@Override
	public String getVPCId() {
		return _subnet.getVpcId();
	}

}
