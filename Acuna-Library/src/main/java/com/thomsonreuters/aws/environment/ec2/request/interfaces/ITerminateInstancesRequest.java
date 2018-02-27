package com.thomsonreuters.aws.environment.ec2.request.interfaces;

import java.util.List;

public interface ITerminateInstancesRequest {
	
    void setInstanceIds(List<String> instanceIds);
}
