package com.thomsonreuters.aws.launchtemplate.impl;

import com.amazonaws.services.ec2.model.LaunchTemplateSpecification;
import com.thomsonreuters.aws.launchtemplate.ILaunchTemplateSpec;

public class LaunchTemplateSpecImpl implements ILaunchTemplateSpec {
	
		private LaunchTemplateSpecification _ltspec;
		
	
		public LaunchTemplateSpecImpl() {
			_ltspec =  new LaunchTemplateSpecification();
		}
	
		public void setLaunchTemplateId(String launchTemplateId) {
			_ltspec.setLaunchTemplateId(launchTemplateId);
		}
		
}
