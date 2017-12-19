/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomsonreuters.aws.environment;

import com.thomsonreuters.aws.environment.impl.EnvImpl;

/**
 *
 * @author U6067157
 */
public class EnvFactory {
    public static IEnv create() {
        return new EnvImpl();
    }
}
