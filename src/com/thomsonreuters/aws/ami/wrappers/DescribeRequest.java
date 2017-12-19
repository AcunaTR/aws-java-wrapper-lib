/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomsonreuters.aws.ami.wrappers;

import com.thomsonreuters.aws.ami.wrappers.impl.DescribeRequestImpl;

/**
 *
 * @author U6067157
 */
public class DescribeRequest {
    public static IDescribeRequest create() {
        return new DescribeRequestImpl();
    }
}
