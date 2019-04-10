package com.hd.entity;

import java.io.Serializable;

public class User implements Serializable {
    /**
     * 用户的id
     */
    private String id;
    /**
     * 用户的名字
     */
    private String name;
    /**
     * 用户的账号
     */
    private String account;
    /**
     * 用户的密码
     */
    private String pwd;
    /**
     * 用户的电话
     */
    private String phone;
    /**
     * 用户的地址
     */
    private String address;
    /**
     * 创建时间
     */
    private String createDate;

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

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
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

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
