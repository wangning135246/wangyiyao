package com.hd.service;

import com.hd.entity.request.HealthAddRequest;
import com.hd.entity.request.HealthModifyRequest;
import com.hd.entity.response.HealthListResponse;

public interface IHealthService {

    /**
     * 查询出健康表的信息
     * @param name
     * @return
     */
    HealthListResponse selectHealthList(String name);

    /**
     * 修改health方法
     * @return
     */
    int modifyHealth(HealthModifyRequest request);

    /**
     * 添加health方法
     * @return
     */
    int addHealth(HealthAddRequest request);
}
