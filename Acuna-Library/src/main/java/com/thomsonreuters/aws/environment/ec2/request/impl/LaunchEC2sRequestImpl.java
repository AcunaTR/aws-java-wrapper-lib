package com.thomsonreuters.aws.environment.ec2.request.impl;

import com.amazonaws.services.ec2.model.LaunchTemplateSpecification;
import com.amazonaws.services.ec2.model.RunInstancesRequest;
import com.thomsonreuters.aws.environment.ec2.request.impl.raw.ILaunchEC2sRequestRaw;
import com.thomsonreuters.aws.environment.ec2.request.interfaces.ILaunchEC2sRequest;

public class LaunchEC2sRequestImpl implements ILaunchEC2sRequest, ILaunchEC2sRequestRaw {

    private final RunInstancesRequest _req;

    public LaunchEC2sRequestImpl() {
        _req = new RunInstancesRequest();
    }

    @Override
    public void setAmiId(String amiId) {
        _req.setImageId(amiId);
    }

    @Override
    public void setLaunchTemplateId(String launchTemplateId) {
        LaunchTemplateSpecification spec = new LaunchTemplateSpecification();
        spec.setLaunchTemplateId(launchTemplateId);
        _req.setLaunchTemplate(spec);
    }

    @Override
    public RunInstancesRequest getRaw() {
        return _req;
    }

	@Override
	public String getAmiId() {
		return _req.getImageId();
	}

	@Override
	public String getLaunchTemplateId() {
		return _req.getLaunchTemplate().getLaunchTemplateId();
	}

	@Override
	public void setMinCount(int count) {
		_req.setMinCount(count);
	}

	@Override
	public void setMaxCount(int count) {
		_req.setMaxCount(count);
	}

	@Override
	public int getMinCount() {
		return _req.getMinCount();
	}

	@Override
	public int getMaxCount() {
		return _req.getMaxCount();
	}

	@Override
	public void setSubnetId(String subnetId) {
		_req.setSubnetId(subnetId);
	}

	@Override
	public String getSubnetId() {
		return _req.getSubnetId();
	}
}
