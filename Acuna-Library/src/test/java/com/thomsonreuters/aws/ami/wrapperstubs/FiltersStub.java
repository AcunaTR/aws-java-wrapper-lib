/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomsonreuters.aws.ami.wrapperstubs;

import java.util.ArrayList;
import java.util.List;

import com.thomsonreuters.aws.filter.IFilter;
import com.thomsonreuters.aws.filter.IFilters;

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
    
    @Override
    public List<IFilter> getFilters() {
        return _filters;
    }

    @Override
    public IFilter getFilter(int idx) {
        // TODO Auto-generated method stub
        return _filters.get(idx);
    }

    @Override
    public void addAllFilters(IFilters filters) {
        // TODO Auto-generated method stub
    }

	@Override
	public boolean contains(IFilter filter) {
		// TODO Auto-generated method stub
		return false;
	}
}
