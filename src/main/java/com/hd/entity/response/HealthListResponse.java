package com.hd.entity.response;

import com.hd.entity.po.HealthListPo;

import java.util.List;

public class HealthListResponse {

    List<HealthListPo> data;

    public List<HealthListPo> getData() {
        return data;
    }

    public void setData(List<HealthListPo> data) {
        this.data = data;
    }
}
