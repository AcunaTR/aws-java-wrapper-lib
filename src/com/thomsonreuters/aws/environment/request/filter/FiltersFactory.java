/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomsonreuters.aws.environment.request.filter;

import com.thomsonreuters.aws.environment.request.filter.impl.FilterImpl;
import com.thomsonreuters.aws.environment.request.filter.impl.FiltersImpl;

/**
 *
 * @author U6067157
 */
public class FiltersFactory {
    public static IFilter createFilter(String name) {
        return new FilterImpl(name);
    }
    
    public static IFilters createFilterCollection() {
        return new FiltersImpl();
    }
}
