package com.thomsonreuters.aws.environment.ec2.request.impl;


import java.util.List;

import com.amazonaws.services.ec2.model.DescribeLaunchTemplatesRequest;
import com.thomsonreuters.aws.environment.ec2.request.impl.raw.IDescribeLaunchTemplatesRequestRaw;
import com.thomsonreuters.aws.environment.ec2.request.interfaces.IDescribeLaunchTemplatesRequest;


public class DescribeLaunchTemplatesRequestImpl implements IDescribeLaunchTemplatesRequest, IDescribeLaunchTemplatesRequestRaw {
	
	private final DescribeLaunchTemplatesRequest _req;
	
	public DescribeLaunchTemplatesRequestImpl() {
		_req = new DescribeLaunchTemplatesRequest();
	}

	@Override
	public DescribeLaunchTemplatesRequest getRaw() {
		
		return _req;
	}
	
	@Override
	public void setLaunchTemplateIds(List<String> launchTemplateIds) {
		_req.setLaunchTemplateIds(launchTemplateIds);
	}

	@Override
	public List<String> getLaunchTemplateIds() {
		return _req.getLaunchTemplateIds();
		
	}
}
