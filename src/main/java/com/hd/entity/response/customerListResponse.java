package com.hd.entity.response;

import com.hd.entity.po.CustomerListPo;

import java.util.List;

public class customerListResponse {


    List<CustomerListPo> data;

    public List<CustomerListPo> getData() {
        return data;
    }

    public void setData(List<CustomerListPo> data) {
        this.data = data;
    }
}
