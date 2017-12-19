/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomsonreuters.aws.ec2.wrappers;

import com.thomsonreuters.aws.ami.wrappers.IAmis;
import com.thomsonreuters.aws.ami.wrappers.IDescribeRequest;

/**
 *
 * @author U6067157
 */
public interface IEnv {
    IAmis describeAmis(IDescribeRequest request);
}
