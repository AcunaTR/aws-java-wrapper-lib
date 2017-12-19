/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomsonreuters.aws.ec2.wrappers.impl;

import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2ClientBuilder;
import com.thomsonreuters.aws.ami.wrappers.IAmis;
import com.thomsonreuters.aws.ami.wrappers.IDescribeRequest;
import com.thomsonreuters.aws.ami.wrappers.impl.AmisImpl;
import com.thomsonreuters.aws.ami.wrappers.impl.IDescribeRequestRaw;
import com.thomsonreuters.aws.ec2.wrappers.IEnv;

/**
 *
 * @author U6067157
 */
public class Ec2EnvImpl implements IEnv {
    
    private final AmazonEC2 _ec2;
    
    public Ec2EnvImpl() {
        _ec2 = AmazonEC2ClientBuilder.defaultClient();
    }
    
    @Override
    public IAmis describeAmis(IDescribeRequest request) {
        IDescribeRequestRaw raw = (IDescribeRequestRaw)request;
        return new AmisImpl(_ec2.describeImages(raw.getRaw()).getImages());
    }
}
