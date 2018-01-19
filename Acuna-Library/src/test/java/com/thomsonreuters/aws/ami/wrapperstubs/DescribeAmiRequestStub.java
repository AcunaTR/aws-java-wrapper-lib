/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomsonreuters.aws.ami.wrapperstubs;

import com.thomsonreuters.aws.environment.ec2.request.IDescribeAmisRequest;
import com.thomsonreuters.aws.filter.IFilters;

/**
 *
 * @author U6067157
 */
public class DescribeAmiRequestStub implements IDescribeAmisRequest {
    
    private IFilters _filters = null;
    
    public static IDescribeAmisRequest create() {
        return new DescribeAmiRequestStub();
    }

    @Override
    public void setFilters(IFilters filters) {
        _filters = filters;
    }
    
    public IFilters getFilters() {
        return _filters;
    }
}
