package com.thomsonreuters.aws.targetgroup;

import com.thomsonreuters.aws.ec2.IEC2;

public interface ITargetGroups {

	int size();
    
    boolean isEmpty();
    
    ITargetGroup get(int idx);
	
}
