/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomsonreuters.aws.ami.wrapperstubs;

import java.util.ArrayList;
import java.util.List;

import com.thomsonreuters.aws.environment.ami.request.filter.IRequestFilter;

/**
 *
 * @author U6067157
 */
public class RequestFilterStub implements IRequestFilter {

    private String _name;
    
    private final List<String> _values = new ArrayList<>();
    
    public void setName(String name) {
        _name = name;
    }
    
    @Override
    public String getName() {
        return _name;
    }

    @Override
    public List<String> getValues() {
        return _values;
    }

    @Override
    public void addValue(String value) {
        _values.add(value);
    } 
}
