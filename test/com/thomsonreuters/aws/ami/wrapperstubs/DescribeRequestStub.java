/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomsonreuters.aws.ami.wrapperstubs;

import com.thomsonreuters.aws.ami.wrappers.IDescribeRequest;
import com.thomsonreuters.aws.ami.wrappers.IRequestFilters;

/**
 *
 * @author U6067157
 */
public class DescribeRequestStub implements IDescribeRequest {
    
    private IRequestFilters _filters = null;
    
    public static IDescribeRequest create() {
        return new DescribeRequestStub();
    }

    @Override
    public void setFilters(IRequestFilters filters) {
        _filters = filters;
    }
    
    public IRequestFilters getFilters() {
        return _filters;
    }
    
    
}
