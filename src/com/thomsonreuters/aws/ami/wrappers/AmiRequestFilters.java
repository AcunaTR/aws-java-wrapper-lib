/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomsonreuters.aws.ami.wrappers;

import com.thomsonreuters.aws.ami.wrappers.impl.AmiRequestFilterImpl;
import com.thomsonreuters.aws.ami.wrappers.impl.DescribeAmiRequestFiltersImpl;

/**
 *
 * @author U6067157
 */
public class AmiRequestFilters {
    public static IAmiRequestFilter createFilter(String name) {
        return new AmiRequestFilterImpl(name);
    }
    
    public static IAmiRequestFilters createFilterCollection() {
        return new DescribeAmiRequestFiltersImpl();
    }
}
