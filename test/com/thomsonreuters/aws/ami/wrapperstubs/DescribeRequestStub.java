/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomsonreuters.aws.ami.wrapperstubs;

import com.thomsonreuters.aws.environment.ami.request.IDescribeAmiRequest;
import com.thomsonreuters.aws.environment.ami.request.filter.IRequestFilters;

/**
 *
 * @author U6067157
 */
public class DescribeRequestStub implements IDescribeAmiRequest {
    
    private IRequestFilters _filters = null;
    
    public static IDescribeAmiRequest create() {
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
