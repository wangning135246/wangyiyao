package com.hd.entity;

import java.io.Serializable;

public class Customer implements Serializable {
    /**
     * 客户的id
     */
    private String id;
    /**
     * 客户的名字
      */
    private String name;
    /**
     * 用户的性别
     */
    private String sex;
    /**
     * 用户的邮箱
     */
    private String email;
    /**
     * 客户的渠道来源
     */
    private String channel;
    /**
     * 客户的工作地址
     */
    private String industry;
    /**
     * 客户的电话
     */
    private String phone;
    /**
     * 客户的住址
     */
    private String address;
    /**
     * 客户的创建时间
     */
    private String createTime;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
