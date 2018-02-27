package com.thomsonreuters.aws.ec2;

import java.util.List;

import com.amazonaws.services.ec2.model.Instance;
import com.thomsonreuters.aws.ec2.impl.EC2sImpl;

public class EC2s {
	
    public static IEC2s create() {
        return new EC2sImpl();
    }
   
    public static IEC2s create(List<Instance> instances) {
        return new EC2sImpl(instances);
    }
}
