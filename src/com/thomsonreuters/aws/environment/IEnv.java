package com.thomsonreuters.aws.environment;

import com.thomsonreuters.aws.ami.wrappers.IAmis;
import com.thomsonreuters.aws.ec2.wrappers.IEC2s;
import com.thomsonreuters.aws.environment.ami.request.IDescribeAmiRequest;

public interface IEnv  {

	IAmis describeAmis(IDescribeAmiRequest request);

	IEC2s describeEC2s(IDescribeEC2Request request);

}
