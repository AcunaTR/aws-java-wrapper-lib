/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomsonreuters.aws.environment.ami.request.impl;

import com.amazonaws.services.ec2.model.DescribeImagesRequest;
import com.thomsonreuters.aws.environment.ami.request.IDescribeAmiRequest;
import com.thomsonreuters.aws.environment.ami.request.filter.IRequestFilters;
import com.thomsonreuters.aws.environment.ami.request.filter.raw.IDescribeRequestFiltersRaw;
import com.thomsonreuters.aws.environment.ami.request.impl.raw.IDescribeRequestRaw;

/**
 *
 * @author U6067157
 */
public class DescribeRequestImpl implements IDescribeAmiRequest, IDescribeRequestRaw {
    private final DescribeImagesRequest _req;
    
    public DescribeRequestImpl() {
        _req = new DescribeImagesRequest();
    }
    
    @Override
    public void setFilters(IRequestFilters filters) {
        IDescribeRequestFiltersRaw raw = (IDescribeRequestFiltersRaw) filters;
        
        _req.setFilters(raw.getRaw());
    }

    @Override
    public DescribeImagesRequest getRaw() {
        return _req;
    }
}
