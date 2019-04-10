package com.hd.dao;

import com.hd.entity.User;
import com.hd.entity.po.AdminListPo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    /**
     * 这个是登陆的方法
     * @param account
     * @param pwd
     * @return
     */
    User login(@Param("account")String account,@Param("pwd")String pwd);

    /**
     * 查询出角色的下拉菜单
     * @return
     */
    List<String> selectAllRole();

    /**
     * 删除客户的时候直接把客户的关系也删除
     * @return
     */
    int deleteRoleId(@Param("id")String id);

    /**
     * 查询出最新插入的一条客户的id
     * @return
     */
    String selectCustomerNewId();

    /**
     * 查询出用户的角色id
     * @param name
     * @return
     */
    String selectRoleId(@Param("name")String name);

    /**
     * 添加客户和角色的关系表
     * @param roleId
     * @param customerId
     * @return
     */
    int insertCustomerAndRole(@Param("roleId")String roleId,@Param("customerId")String customerId);

    /**
     * 修改roleID
     * @param roleId
     * @param customerId
     * @return
     */
    int modifyRoleId(@Param("roleId")String roleId,@Param("customerId")String customerId);

    /**
     * 查询出用户的角色的名字
     * @param userId
     * @return
     */
    String adminPower(@Param("userId")String userId);

    /**
     * 查询管理员的List的方法
     * @param adminName
     * @return
     */
    List<AdminListPo> selectAdminList(@Param("adminName")String adminName);

    /**
     * 这个是修改管理员的方法
     * @return
     */
    int modifyAdmin(@Param("id")String id,@Param("name")String name,
                    @Param("account")String account,@Param("phone")String phone,
                    @Param("address")String address);

    /**
     * 修改管理员权限的方法
     * @return
     */
    int modifyAdminRole(@Param("userId")String userId,@Param("roleId")String roleId);

    /**
     * 添加管理员的方法
     * @return
     */
    int addAdmin(@Param("name")String name,
                 @Param("account")String account,
                 @Param("pwd")String pwd,
                 @Param("phone")String phone,
                 @Param("address")String address);

    /**
     * 添加管理员角色的方法
     * @return
     */
    int addAdminRole(@Param("userId")String userId,@Param("roleId")String roleId);


    /**
     * 这个是删除管理员的方法
     * @param id
     * @return
     */
    int deleteAdmin(@Param("id")String id);

    /**
     * 删除管理员的权限的方法
     * @param userId
     * @return
     */
    int deleteAdminRole(@Param("userId")String userId);

    /**
     * 查询出最新插入的管理员的id
     * @return
     */
    String selectAdminNewId();

    /**
     * 查询出用户的密码
     * @param userId
     * @return
     */
    String selectPassword(@Param("userId")String userId);

    /**
     * 修改用户的密码
     * @param password
     * @param userId
     * @return
     */
    int updatePassword(@Param("password")String password,@Param("userId")String userId);

}
