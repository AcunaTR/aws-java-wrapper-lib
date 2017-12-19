/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomsonreuters.aws.environment.ami.request;

import com.thomsonreuters.aws.environment.ami.request.filter.IRequestFilters;

/**
 *
 * @author U6067157
 */
public interface IDescribeAmiRequest {
    void setFilters(IRequestFilters filters);
}
