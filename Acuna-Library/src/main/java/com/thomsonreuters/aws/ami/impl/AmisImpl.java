/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomsonreuters.aws.ami.impl;

import com.amazonaws.services.ec2.model.Image;
import com.thomsonreuters.aws.ami.IAmi;
import com.thomsonreuters.aws.ami.IAmis;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author U6067157
 */
public class AmisImpl implements IAmis {
    
    private final List<Image> _amis;
    
    public AmisImpl(List<Image> amis) {
        _amis = amis;
    }
    
    @Override
    public int size() {
        return _amis.size();
    }
    
    @Override
    public boolean isEmpty() {
        return _amis.isEmpty();
    }
    
    @Override
    public IAmi get(int idx) {
        return new AmiImpl(_amis.get(idx));
    }
    
    @Override
    public String toString() {
        return _amis.toString();
    }

    @Override
    public List<String> getIds() {
        List<String> ids = new ArrayList<>();

        _amis.forEach((img) -> {
            ids.add(img.getImageId());
        });
        return ids;
    }

    @Override
    public List<String> getNames() {
        List<String> names = new ArrayList<>();

        _amis.stream().map((img) -> img.getTags()).forEachOrdered((tags) -> {
            tags.stream().filter((t) -> ("Name".equals(t.getKey()))).forEachOrdered((t) -> {
                names.add(t.getValue());
            });
        });
        return names;
    }

    @Override
    public Iterator<IAmi> iterator() {
        return new AmiIterator(_amis);
    }

}
