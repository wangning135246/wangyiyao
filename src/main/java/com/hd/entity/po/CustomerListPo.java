package com.hd.entity.po;

import java.io.Serializable;

public class CustomerListPo implements Serializable {

    /**
     * 用户的id
     */
    private String id;
    /**
     * 用户的名字
     */
    private String name;
    /**
     * 用户的来源
     */
    private String channel;
    /**
     * 用户的工作地
     */
    private String industry;
    /**
     * 用户的电话
     */
    private String phone;
    /**
     * 角色
     */
    private String role;
    /**
     * 用户的地址
     */
    private String address;
    /**
     * 创建时间
     */
    private String createTime;

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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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
}
