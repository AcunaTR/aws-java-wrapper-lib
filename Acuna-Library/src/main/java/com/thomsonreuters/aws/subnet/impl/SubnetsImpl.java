package com.thomsonreuters.aws.subnet.impl;

import java.util.ArrayList;
import java.util.List;

import com.amazonaws.services.ec2.model.Subnet;
import com.thomsonreuters.aws.subnet.ISubnet;
import com.thomsonreuters.aws.subnet.ISubnets;

public class SubnetsImpl implements ISubnets {

	private List<Subnet> _subnets;
	
	public SubnetsImpl() {
		_subnets = new ArrayList<>();
	}
	
	public SubnetsImpl(List<Subnet> subnets) {
		_subnets = subnets;
	}
	
	@Override
	public boolean containsId(String subnetId) {
		for(Subnet s : _subnets) {
			if(s.getSubnetId().equals(subnetId)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		return _subnets.isEmpty();
	}

	@Override
	public int size() {
		return _subnets.size();
	}

	@Override
	public ISubnet get(int idx) {
		return new SubnetImpl(_subnets.get(idx));
	}

}
