/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomsonreuters.aws.ami;

import com.thomsonreuters.aws.ami.wrappers.IAmi;
import com.thomsonreuters.aws.ami.wrappers.IRequestFilters;
import java.util.List;

/**
 *
 * @author U6067157
 */
public interface IImage {
    List<IAmi> findImages(IRequestFilters filters);
}
