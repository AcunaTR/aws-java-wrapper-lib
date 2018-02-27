package com.thomsonreuters.aws.launchtemplate;

import com.thomsonreuters.aws.launchtemplate.impl.LaunchTemplateImpl;

public class LaunchTemplate {
	
	public static ILaunchTemplate create() {
		return new LaunchTemplateImpl();
	}

}
