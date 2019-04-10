package com.hd.service;

import com.hd.entity.User;
import com.hd.entity.response.customerListResponse;

import java.util.List;

public interface IUserService {
    /**
     * 登陆的方法
     * @param account
     * @param pwd
     * @return
     */
    User login(String account, String pwd);

    /**
     * 查询出所有的role名字
     * @return
     */
    List<String> selectAllRole();

}
