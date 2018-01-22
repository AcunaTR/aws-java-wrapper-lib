/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomsonreuters.aws.filter;

import java.util.List;

/**
 *
 * @author U6067157
 */
public interface IFilters {
    void addFilter(IFilter filter);
    IFilter getFilter(int idx);
    List<IFilter> getFilters();
    void addAllFilters(IFilters filters);
    boolean contains(IFilter filter);
}
