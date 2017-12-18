/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomsonreuters.aws.ami.wrappers;

import com.amazonaws.services.ec2.model.Tag;

/**
 *
 * @author U6067157
 */
public class TagImpl implements IAmiTag {
    private final Tag _tag;
    
    public TagImpl(Tag tag)
    {
        _tag = tag;
    }
    
    public TagImpl(String name, String val) {
        _tag = new Tag(name, val);
    }
	
    @Override
    public String getName() {
            return _tag.getKey();
    }

    @Override
    public String getValue() {
            return _tag.getValue();
    }
}
