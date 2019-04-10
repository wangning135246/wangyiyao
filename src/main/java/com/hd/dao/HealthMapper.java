package com.hd.dao;

import com.hd.entity.Health;
import com.hd.entity.request.HealthAddRequest;
import com.hd.entity.request.HealthModifyRequest;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HealthMapper {

    /**
     * 删除客户的健康表的数据
     * @param id
     * @return
     */
    int deleteHealthAndCustomer(@Param("id")String id);

    /**
     * 查询出健康表的信息
     * @param id
     * @return
     */
    List<Health> selectHealthList(@Param("id")String id);

    /**
     * 添加health
     * @param request
     * @return
     */
    int addHealth(HealthAddRequest request);

    /**
     * 修改Health
     * @param request
     * @return
     */
    int modifyHealth(HealthModifyRequest request);

    /**
     * 判断下拉菜单的名单
     * @param id
     * @return
     */
    List<Health> selectCustomerId(@Param("id")String id);
}
