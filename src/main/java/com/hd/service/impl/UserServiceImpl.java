package com.hd.service.impl;

import com.hd.dao.UserMapper;
import com.hd.entity.User;
import com.hd.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;



    /**
     * 登陆的方法
     * @param account
     * @param pwd
     * @return
     */
    @Override
    public User login(String account, String pwd) {
        //查询出符合套件的user
       User user =  userMapper.login(account,pwd);
       //符合的话直接返回
       if(user != null){
           return user;
       }else {
           //不符合的话创一个对象，并且为他赋值为0
           User user1 = new User();
           user1.setName("0");
           return user1;
       }
    }

    /**
     * 为了把角色封装成一个下拉列表
     * @return
     */
    @Override
    public List<String> selectAllRole() {
        //为前端的角色的下拉列表进行赋值
        return userMapper.selectAllRole();
    }
}
