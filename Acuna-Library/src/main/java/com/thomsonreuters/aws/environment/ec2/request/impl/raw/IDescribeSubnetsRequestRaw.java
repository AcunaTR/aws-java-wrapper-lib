package com.thomsonreuters.aws.environment.ec2.request.impl.raw;

import com.amazonaws.services.ec2.model.DescribeLaunchTemplatesRequest;
import com.amazonaws.services.ec2.model.DescribeSubnetsRequest;

public interface IDescribeSubnetsRequestRaw {

	DescribeSubnetsRequest getRaw();
}
