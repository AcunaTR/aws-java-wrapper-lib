/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomsonreuters.aws.ami.wrapperstubs;

import java.util.ArrayList;
import java.util.List;

import com.thomsonreuters.aws.environment.ami.request.filter.IRequestFilter;
import com.thomsonreuters.aws.environment.ami.request.filter.IRequestFilters;

/**
 *
 * @author U6067157
 */
public class RequestFiltersStub implements IRequestFilters {

    private final List<IRequestFilter> _filters = new ArrayList<>();
    
    @Override
    public void addFilter(IRequestFilter filter) {
        _filters.add(filter);
    }
    
    
    public List<IRequestFilter> getFilters() {
        return _filters;
    }
}
