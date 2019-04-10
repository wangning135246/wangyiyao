package com.hd.entity.request;

import java.io.Serializable;

public class AdminAddRequest implements Serializable {
    /**
     * 管理员的名字
     */
    private String name;
    /**
     * 管理员的账号
     */
    private String account;
    /**
     * 管理员的手机号
     */
    private String phone;
    /**
     * 管理员的地址
     */
    private String address;
    /**
     * 管理员的权限
     */
    private String roleName;

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

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
