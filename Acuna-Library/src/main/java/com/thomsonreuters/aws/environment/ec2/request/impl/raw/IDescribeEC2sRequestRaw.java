package com.thomsonreuters.aws.environment.ec2.request.impl.raw;

import com.amazonaws.services.ec2.model.DescribeInstancesRequest;

public interface IDescribeEC2sRequestRaw {

    DescribeInstancesRequest getRaw();
}
