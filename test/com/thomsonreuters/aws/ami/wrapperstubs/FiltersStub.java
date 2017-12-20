/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomsonreuters.aws.ami.wrapperstubs;

import java.util.ArrayList;
import java.util.List;

import com.thomsonreuters.aws.environment.ec2.request.filter.IFilter;
import com.thomsonreuters.aws.environment.ec2.request.filter.IFilters;

/**
 *
 * @author U6067157
 */
public class FiltersStub implements IFilters {

    private final List<IFilter> _filters = new ArrayList<>();
    
    @Override
    public void addFilter(IFilter filter) {
        _filters.add(filter);
    }
    
    
    public List<IFilter> getFilters() {
        return _filters;
    }
}
