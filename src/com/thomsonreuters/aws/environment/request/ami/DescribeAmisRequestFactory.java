/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomsonreuters.aws.environment.request.ami;

import com.thomsonreuters.aws.environment.request.ami.impl.DescribeAmisRequestImpl;

/**
 *
 * @author U6067157
 */
public class DescribeAmisRequestFactory {
    public static IDescribeAmisRequest create() {
        return new DescribeAmisRequestImpl();
    }
}
