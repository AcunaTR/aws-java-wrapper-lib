package com.thomsonreuters.aws.ec2.impl;

import java.util.List;

import com.amazonaws.services.ec2.model.Instance;
import com.thomsonreuters.aws.ec2.IEC2s;

public class EC2sImpl implements IEC2s {

	private final List<Instance> _ec2s;
	
	public EC2sImpl(List<Instance> instances) {
		_ec2s = instances;
	}

}
