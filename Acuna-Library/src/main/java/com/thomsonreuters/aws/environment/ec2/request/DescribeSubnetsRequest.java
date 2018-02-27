package com.thomsonreuters.aws.environment.ec2.request;

import com.thomsonreuters.aws.environment.ec2.request.impl.DescribeSubnetsRequestImpl;
import com.thomsonreuters.aws.environment.ec2.request.impl.LaunchEC2sRequestImpl;
import com.thomsonreuters.aws.environment.ec2.request.interfaces.IDescribeSubnetsRequest;
import com.thomsonreuters.aws.environment.ec2.request.interfaces.ILaunchEC2sRequest;

public class DescribeSubnetsRequest {

	public static IDescribeSubnetsRequest create() {
        return new DescribeSubnetsRequestImpl();
    }
	
}
