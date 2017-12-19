/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomsonreuters.aws.environment.request.ami.impl;

import com.amazonaws.services.ec2.model.DescribeImagesRequest;
import com.thomsonreuters.aws.environment.request.ami.IDescribeAmisRequest;
import com.thomsonreuters.aws.environment.request.ami.raw.IDescribeAmisRequestRaw;
import com.thomsonreuters.aws.environment.request.filter.IFilters;
import com.thomsonreuters.aws.environment.request.filter.raw.IFiltersRaw;

/**
 *
 * @author U6067157
 */
public class DescribeAmisRequestImpl implements IDescribeAmisRequest, IDescribeAmisRequestRaw {
    private final DescribeImagesRequest _req;
    
    public DescribeAmisRequestImpl() {
        _req = new DescribeImagesRequest();
    }
    
    @Override
    public void setFilters(IFilters filters) {
        IFiltersRaw raw = (IFiltersRaw) filters;
        
        _req.setFilters(raw.getRaw());
    }

    @Override
    public DescribeImagesRequest getRaw() {
        return _req;
    }
}
