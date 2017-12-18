/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomsonreuters.aws.ami.wrappers;

import com.amazonaws.services.ec2.model.Image;

/**
 *
 * @author U6067157
 */
public class AmiImpl {
    private final Image _ami;
	
	public AmiImpl(Image ami) {
            _ami = ami;
	}
	
	public String getImageId() {
		
            return _ami.getImageId();
	}

	public IAmiTags getTags() {
            return new TagsImpl(_ami.getTags());
	}
	
	public String getImageName() {
            return _ami.getName();
	}
}
