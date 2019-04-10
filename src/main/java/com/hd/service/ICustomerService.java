package com.hd.service;

import com.hd.entity.request.CustomerInsertRequest;
import com.hd.entity.request.CustomerModifyRequest;
import com.hd.entity.response.customerListResponse;

import java.util.List;

public interface ICustomerService {

    /**
     * 查询客户账号密码的方法
     * @return
     */
    customerListResponse selectCustomerList(String name);

    /**
     * 添加用户的方法
     * @param request
     * @return
     */
    int insertCustomer(CustomerInsertRequest request);

    /**
     * 删除用户的方法
     * @param id
     * @return
     */
    int deleteCustomer(String id);

    /**
     * 修改用户的方法
     * @param request
     * @return
     */
    int modifyCustomer(CustomerModifyRequest request);

    /**
     * 查询所有的customer
     * @return
     */
    List<String> selectAllCustomer();

    List<String> selectCustomerEmailList();

 }
