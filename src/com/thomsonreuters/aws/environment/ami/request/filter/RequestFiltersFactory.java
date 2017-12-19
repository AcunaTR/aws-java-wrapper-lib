/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomsonreuters.aws.environment.ami.request.filter;

import com.thomsonreuters.aws.environment.ami.request.filter.impl.DescribeRequestFilterImpl;
import com.thomsonreuters.aws.environment.ami.request.filter.impl.DescribeRequestFiltersImpl;

/**
 *
 * @author U6067157
 */
public class RequestFiltersFactory {
    public static IRequestFilter createFilter(String name) {
        return new DescribeRequestFilterImpl(name);
    }
    
    public static IRequestFilters createFilterCollection() {
        return new DescribeRequestFiltersImpl();
    }
}
