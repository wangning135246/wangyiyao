package com.hd.entity.po;

import java.io.Serializable;

public class AdminListPo implements Serializable {
    /**
     * 管理员的id
     */
    private String id;
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
     * 管理员的家庭住址
     */
    private String address;
    /**
     * 管理员的角色的名字
     */
    private String roleName;
    /**
     * 管理员的创建的时间
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

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
