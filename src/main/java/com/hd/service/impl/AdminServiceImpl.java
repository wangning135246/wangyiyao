package com.hd.service.impl;


import com.hd.dao.UserMapper;
import com.hd.entity.po.AdminListPo;
import com.hd.entity.request.AdminAddRequest;
import com.hd.entity.request.AdminModifyRequest;
import com.hd.entity.response.AdminListResponse;
import com.hd.service.IAdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminServiceImpl implements IAdminService {

    @Resource
    private UserMapper userMapper;


    /**
     * 这个是判断权限的方法
     * @param userId
     * @return
     */
    @Override
    public int adminPower(String userId) {
        //查询出该用户的权限
        String roleName = userMapper.adminPower(userId);
        //判断该用户是否是超级管理员
        if(roleName.equals("超级管理员")){
            return 1;
        }else {
            return 0;
        }
    }

    /**
     * 查询管理员的列表的方法
     * @param adminName
     * @return
     */
    @Override
    public AdminListResponse selectAdminList(String adminName) {
        //这个是查询管理员列表的方法
        List<AdminListPo> list =  userMapper.selectAdminList(adminName);
        //创建返回的封装对象
        AdminListResponse response = new AdminListResponse();
        //为返回的封装对象赋值
        response.setData(list);
        return response;
    }

    /**
     * 这个是修改管理员的方法
     * @param request
     * @return
     */
    @Override
    public int modifyAdmin(AdminModifyRequest request) {
        //查询管理员的权限Id
        String id = userMapper.selectRoleId(request.getRoleName());
        //修改管理员的权限
        userMapper.modifyAdminRole(request.getId(),id);
        //修改管理员的资料
        int a = userMapper.modifyAdmin(request.getId(),request.getName(),request.getAccount(),request.getPhone(),request.getAddress());
        return a;
    }

    /**
     * 这个是添加管理员的方法
     * @param request
     * @return
     */
    @Override
    public int addAdmin(AdminAddRequest request) {
        //添加管理员的权限
        int b =  userMapper.addAdmin(request.getName(),request.getAccount(),"123456",request.getPhone(),request.getAddress());
        //查询最新插入的管理员的id
        String id = userMapper.selectAdminNewId();
        //查询权限的id
        String roleId  = userMapper.selectRoleId(request.getRoleName());
        //插入权限和管理员的关系
        userMapper.addAdminRole(id,roleId);
        return b;
    }

    /**
     * 这个是删除管理员的方法
     * @param id
     * @return
     */
    @Override
    public int deleteAdmin(String id) {
        int a = userMapper.deleteAdmin(id);
        userMapper.deleteAdminRole(id);
        return a;
    }


}
