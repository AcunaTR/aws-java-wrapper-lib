package com.thomsonreuters.aws.environment.wrappers;

import com.thomsonreuters.aws.ami.wrappers.IAmis;
import com.thomsonreuters.aws.ami.wrappers.IDescribeRequest;

public interface IEC2Env  {

	IAmis describeAmis(IDescribeRequest request);

}
