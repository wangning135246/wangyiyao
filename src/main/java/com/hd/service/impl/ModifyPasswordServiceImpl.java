package com.hd.service.impl;


import com.hd.dao.UserMapper;
import com.hd.service.IModifyPasswordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ModifyPasswordServiceImpl implements IModifyPasswordService {

    @Resource
    private UserMapper userMapper;

    /**
     * 这个方法是修改密码
     * @param oldPassword
     * @param password
     * @param userId
     * @return
     */
    @Override
    public int modifyPassword(String oldPassword, String password,String userId) {
        String pwd =  userMapper.selectPassword(userId);
        if(pwd.equals(oldPassword)){
            userMapper.updatePassword(password,userId);
            return 1;
        }else{
            return 2;
        }
    }
}
