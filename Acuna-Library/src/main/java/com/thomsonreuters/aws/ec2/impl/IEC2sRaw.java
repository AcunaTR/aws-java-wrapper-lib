package com.thomsonreuters.aws.ec2.impl;

import java.util.List;

import com.amazonaws.services.ec2.model.Instance;

interface IEC2sRaw {

    List<Instance> getRaw();	
}
