package com.thomsonreuters.aws.environment.ec2.request.impl.raw;

import com.amazonaws.services.ec2.model.RunInstancesRequest;

public interface ILaunchEC2sRequestRaw {

    RunInstancesRequest getRaw();
}
