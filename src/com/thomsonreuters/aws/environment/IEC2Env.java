package com.thomsonreuters.aws.environment;

import com.thomsonreuters.aws.ami.IAmis;
import com.thomsonreuters.aws.ec2.IEC2s;
import com.thomsonreuters.aws.environment.request.ami.IDescribeAmisRequest;
import com.thomsonreuters.aws.environment.request.ec2.IDescribeEC2sRequest;

public interface IEC2Env  {

    IAmis describeAmis(IDescribeAmisRequest request);

    IEC2s describeEC2s(IDescribeEC2sRequest request);

}
