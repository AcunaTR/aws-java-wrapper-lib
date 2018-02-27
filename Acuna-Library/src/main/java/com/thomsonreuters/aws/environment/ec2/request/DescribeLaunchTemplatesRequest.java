package com.thomsonreuters.aws.environment.ec2.request;

import com.thomsonreuters.aws.environment.ec2.request.impl.DescribeLaunchTemplatesRequestImpl;
import com.thomsonreuters.aws.environment.ec2.request.interfaces.IDescribeLaunchTemplatesRequest;

public class DescribeLaunchTemplatesRequest {
		    
	    public static IDescribeLaunchTemplatesRequest create() {
	        return new DescribeLaunchTemplatesRequestImpl();
	    }
	

}
