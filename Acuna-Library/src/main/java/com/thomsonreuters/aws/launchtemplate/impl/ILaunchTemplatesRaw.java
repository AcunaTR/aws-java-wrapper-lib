package com.thomsonreuters.aws.launchtemplate.impl;

import java.util.List;

import com.amazonaws.services.ec2.model.LaunchTemplate;

public interface ILaunchTemplatesRaw {
	
	List<LaunchTemplate> getRaw();

}
