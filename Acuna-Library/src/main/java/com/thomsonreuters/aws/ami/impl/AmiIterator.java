/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomsonreuters.aws.ami.impl;

import com.amazonaws.services.ec2.model.Image;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author U6067157
 * @param <IAmi>
 */
public class AmiIterator<IAmi> implements Iterator<IAmi> {

    private final List<Image> _amis;
    private final Iterator<Image> _iterator;
    
    public AmiIterator(List<Image> amis) {
        _amis = amis;
        _iterator = _amis.iterator();
    }
    
    @Override
    public boolean hasNext() {
        return _iterator.hasNext();
    }

    @Override
    public IAmi next() {
        return (IAmi)new AmiImpl(_iterator.next());
    }
}
