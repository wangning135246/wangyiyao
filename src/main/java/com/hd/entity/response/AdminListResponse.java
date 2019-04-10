package com.hd.entity.response;

import com.hd.entity.po.AdminListPo;

import java.util.List;

public class AdminListResponse {

    /**
     * 查询管理员列表的方法
     */
    List<AdminListPo> data;

    public List<AdminListPo> getData() {
        return data;
    }

    public void setData(List<AdminListPo> data) {
        this.data = data;
    }
}
