package com.hd.entity.request;

import java.io.Serializable;

public class CustomerInsertRequest implements Serializable {

    /**
     * 用户的名字
     */
    private String name;
    /**
     * 用户的渠道
     */
    private String channel;
    /**
     * 用户的公司
     */
    private String industry;
    /**
     * 用户的性别
     */
    private String sex;
    /**
     * 用户的邮箱
     */
    private String email;
    /**
     * 用户的手机号
     */
    private String phone;
    /**
     * 用户的地址
     */
    private String address;
    /**
     * 用户的角色
     */
    private String customerRole;

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

    public String getCustomerRole() {
        return customerRole;
    }

    public void setCustomerRole(String customerRole) {
        this.customerRole = customerRole;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
