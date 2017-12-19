/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomsonreuters.aws.ami.wrappers.impl;

import com.amazonaws.services.ec2.model.Filter;
import com.thomsonreuters.aws.ami.wrappers.IAmiRequestFilter;
import com.thomsonreuters.aws.ami.wrappers.IAmiRequestFilters;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author U6067157
 */
public class DescribeAmiRequestFiltersImpl implements IAmiRequestFilters, IDescribeAmiRequestFiltersRaw {

    private final List<Filter> _filters;
    
    public DescribeAmiRequestFiltersImpl() {
        _filters = new ArrayList<>();
    }
    
    @Override
    public void addFilter(IAmiRequestFilter filter) {
        IDescribeAmiRequestFilterRaw raw = (IDescribeAmiRequestFilterRaw)filter;
        _filters.add(raw.getRaw());
    }

    @Override
    public List<Filter> getRaw() {
        return _filters;
    }
    
}
