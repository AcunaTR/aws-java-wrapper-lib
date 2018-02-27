package com.thomsonreuters.aws.environment.ec2.request.interfaces;

public interface ILaunchEC2sRequest {

    void setAmiId(String amiId);
    String getAmiId();
    void setLaunchTemplateId(String launchTemplateId);
    String getLaunchTemplateId();
    void setMinCount(int count);
    void setMaxCount(int count);
    int getMinCount();
    int getMaxCount();
    void setSubnetId(String subnetId);
    String getSubnetId();
}
