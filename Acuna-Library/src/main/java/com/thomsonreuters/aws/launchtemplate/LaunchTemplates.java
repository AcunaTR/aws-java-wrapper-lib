package com.thomsonreuters.aws.launchtemplate;

import com.thomsonreuters.aws.launchtemplate.impl.LaunchTemplatesImpl;

public class LaunchTemplates {
	
	public static ILaunchTemplates create() {
		return new LaunchTemplatesImpl();
	}

}
