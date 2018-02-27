package com.thomsonreuters.aws.environment.ec2.request;

import com.thomsonreuters.aws.environment.ec2.request.impl.DescribeEC2sRequestImpl;
import com.thomsonreuters.aws.environment.ec2.request.interfaces.IDescribeEC2sRequest;

public class DescribeEC2sRequest {
    
    public static IDescribeEC2sRequest create() {
        return new DescribeEC2sRequestImpl();
    }
}
