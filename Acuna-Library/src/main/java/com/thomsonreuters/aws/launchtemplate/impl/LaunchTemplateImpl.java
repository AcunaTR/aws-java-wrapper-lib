package com.thomsonreuters.aws.launchtemplate.impl;

import com.amazonaws.services.ec2.model.LaunchTemplate;
import com.thomsonreuters.aws.launchtemplate.ILaunchTemplate;

public class LaunchTemplateImpl implements ILaunchTemplate {
	
	private final LaunchTemplate _launchTem;

	public LaunchTemplateImpl() {
		_launchTem = new LaunchTemplate();		
	}
	
	@Override
	public String getTemplateID() {
		return _launchTem.getLaunchTemplateId();
	}
}
