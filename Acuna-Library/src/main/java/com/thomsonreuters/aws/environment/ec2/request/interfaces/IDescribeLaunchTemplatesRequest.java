package com.thomsonreuters.aws.environment.ec2.request.interfaces;

import java.util.List;

public interface IDescribeLaunchTemplatesRequest {

	void setLaunchTemplateIds(List<String> launchTemplateIds);
	List<String> getLaunchTemplateIds();
	
}
