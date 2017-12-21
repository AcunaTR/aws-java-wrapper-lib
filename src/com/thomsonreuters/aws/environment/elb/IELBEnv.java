package com.thomsonreuters.aws.environment.elb;

import com.thomsonreuters.aws.environment.elb.targets.*;
import com.thomsonreuters.aws.targetgroup.ITargetGroups;

public interface IELBEnv {

    ITargetGroups describeTargetGroups(IDescribeTargetGroupsRequest req);

    void deregisterTargets(IDeregisterTargetsRequest req);	
}