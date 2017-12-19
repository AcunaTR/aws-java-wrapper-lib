/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomsonreuters.aws.ami.impl;

import com.thomsonreuters.aws.ami.IImage;
import com.thomsonreuters.aws.ami.wrappers.IAmi;
import com.thomsonreuters.aws.ami.wrappers.IRequestFilters;
import java.util.List;

/**
 *
 * @author U6067157
 */
public class ImageImpl implements IImage {
    
    @Override
    public List<IAmi> findImages(IRequestFilters filters) {
        return null;
    }
}
