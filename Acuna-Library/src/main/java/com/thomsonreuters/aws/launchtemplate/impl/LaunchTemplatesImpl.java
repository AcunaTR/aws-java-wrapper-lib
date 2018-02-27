package com.thomsonreuters.aws.launchtemplate.impl;

import java.util.ArrayList;
import java.util.List;

import com.amazonaws.services.ec2.model.LaunchTemplate;
import com.thomsonreuters.aws.launchtemplate.ILaunchTemplates;

public class LaunchTemplatesImpl implements ILaunchTemplates, ILaunchTemplatesRaw {

	private final List<LaunchTemplate> _templates;
	
	public LaunchTemplatesImpl(List<LaunchTemplate> templates) {
		_templates = templates;
	}
	
	public LaunchTemplatesImpl() {
		_templates = new ArrayList<>();
	}
	
	@Override
	public List<LaunchTemplate> getRaw() {
		return _templates;
	}
	
	@Override
	public boolean containsId(String templateId) {
		for (LaunchTemplate lt : _templates) {
			if(lt.getLaunchTemplateId().equals(templateId)) {
				return true;
			}
		}
		
		return false;
	}

}
