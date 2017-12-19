/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomsonreuters.aws.environment.ami.request;

import com.thomsonreuters.aws.environment.ami.request.impl.DescribeRequestImpl;

/**
 *
 * @author U6067157
 */
public class DescribeRequestFactory {
    public static IDescribeAmiRequest create() {
        return new DescribeRequestImpl();
    }
}
