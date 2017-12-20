package com.thomsonreuters.aws.environment.elb.impl;

import com.thomsonreuters.aws.environment.elb.IELBEnv;
import com.thomsonreuters.aws.environment.elb.request.targetgroup.IDeregisterTargetsRequest;
import com.thomsonreuters.aws.environment.elb.request.targetgroup.IDescribeTargetGroupsRequest;
import com.thomsonreuters.aws.targetgroup.ITargetGroups;

public class ELBEnvImpl implements IELBEnv {

	@Override
	public ITargetGroups describeTargetGroups(IDescribeTargetGroupsRequest req) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deregisterTargets(IDeregisterTargetsRequest req) {
		// TODO Auto-generated method stub
		
	}

}
