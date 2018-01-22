/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomsonreuters.aws.ami.wrapperstubs;

import java.util.Collection;

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

	@Override
	public void setAmiIds(Collection<String> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAmiId(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<String> getAmiIds() {
		// TODO Auto-generated method stub
		return null;
	}
}
