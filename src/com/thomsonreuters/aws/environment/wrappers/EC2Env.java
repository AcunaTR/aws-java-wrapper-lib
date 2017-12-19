/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomsonreuters.aws.environment.wrappers;

import com.thomsonreuters.aws.environment.wrappers.impl.EC2EnvImpl;

/**
 *
 * @author U6067157
 */
public class EC2Env {
    public static IEC2Env create() {
        return new EC2EnvImpl();
    }
}
