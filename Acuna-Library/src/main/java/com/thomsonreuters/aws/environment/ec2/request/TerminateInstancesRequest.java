package com.thomsonreuters.aws.environment.ec2.request;

import com.thomsonreuters.aws.environment.ec2.request.impl.TerminateInstancesRequestImpl;
import com.thomsonreuters.aws.environment.ec2.request.interfaces.ITerminateInstancesRequest;

public class TerminateInstancesRequest {

    public static ITerminateInstancesRequest create() {
        return new TerminateInstancesRequestImpl();
    }
}
