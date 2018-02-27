package com.thomsonreuters.aws.ami;

import java.util.List;

import com.amazonaws.services.ec2.model.Image;
import com.thomsonreuters.aws.ami.impl.AmisImpl;

public class Amis {
	
	public static IAmis create(List<Image> amis) {
		return new AmisImpl(amis);
	}
	
}
