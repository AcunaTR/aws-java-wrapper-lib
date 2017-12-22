package com.thomsonreuters.aws.ec2.impl;

import java.util.ArrayList;
import java.util.List;

import com.amazonaws.services.ec2.model.Instance;
import com.thomsonreuters.aws.ec2.IEC2;
import com.thomsonreuters.aws.ec2.IEC2s;

public class EC2sImpl implements IEC2s, IEC2sRaw {

    private final List<Instance> _ec2s;

    public EC2sImpl(List<Instance> instances) {
        _ec2s = instances;
    }

    public EC2sImpl() {
		_ec2s = new ArrayList<>();
	}

	@Override
    public int size() {
        return _ec2s.size();
    }

    @Override
    public boolean isEmpty() {
        return _ec2s.isEmpty();
    }

    @Override
    public IEC2 get(int idx) {
        return new EC2Impl(_ec2s.get(idx));
    }

	@Override
	public void addAll(IEC2s ec2s) {
		IEC2sRaw raw = (IEC2sRaw) ec2s;
		_ec2s.addAll(raw.getRaw());
	}

	@Override
	public List<Instance> getRaw() {
		return _ec2s;
	}
}
