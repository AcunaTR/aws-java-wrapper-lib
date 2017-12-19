/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomsonreuters.aws.ami.wrappers.impl;

import com.amazonaws.services.ec2.model.DescribeImagesRequest;
import com.thomsonreuters.aws.ami.wrappers.IAmiRequestFilters;

/**
 *
 * @author U6067157
 */
public class DescribeAmiRequestImpl {
    private final DescribeImagesRequest _req;
    
    public DescribeAmiRequestImpl() {
        _req = new DescribeImagesRequest();
    }
    
    public void setFilters(IAmiRequestFilters filters) {
        IDescribeAmiRequestFiltersRaw raw = (IDescribeAmiRequestFiltersRaw) filters;
        
        _req.setFilters(raw.getRaw());
    }
}
