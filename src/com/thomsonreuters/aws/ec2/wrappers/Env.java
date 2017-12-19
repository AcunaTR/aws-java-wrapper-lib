/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomsonreuters.aws.ec2.wrappers;

import com.thomsonreuters.aws.ec2.wrappers.impl.Ec2EnvImpl;

/**
 *
 * @author U6067157
 */
public class Env {
    public static IEnv create() {
        return new Ec2EnvImpl();
    }
}
