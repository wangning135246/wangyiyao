package com.hd.service;

import com.hd.entity.request.AdminAddRequest;
import com.hd.entity.request.AdminModifyRequest;
import com.hd.entity.response.AdminListResponse;
import org.apache.ibatis.annotations.Param;

public interface IAdminService {

    /**
     * 判断管理员的权限是否达到要求
     * @param userId
     * @return
     */
    int adminPower(String userId);

    /**
     * 查询管理员的列表的方法
     * @param adminName
     * @return
     */
    AdminListResponse selectAdminList(String adminName);

    /**
     * 这个是修改管理员的方法
     * @return
     */
    int modifyAdmin(AdminModifyRequest request);

    /**
     * 添加管理员的方法
     * @return
     */
    int addAdmin(AdminAddRequest request);

    /**
     * 这个是删除管理员的方法
     * @param id
     * @return
     */
    int deleteAdmin(String id);

}
