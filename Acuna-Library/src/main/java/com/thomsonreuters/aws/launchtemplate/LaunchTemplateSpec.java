package com.thomsonreuters.aws.launchtemplate;

import com.thomsonreuters.aws.launchtemplate.impl.LaunchTemplateSpecImpl;


public class LaunchTemplateSpec {
	
    public static LaunchTemplateSpecImpl create() {
        return new LaunchTemplateSpecImpl();
    }
}
