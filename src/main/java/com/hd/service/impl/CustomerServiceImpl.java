package com.hd.service.impl;

import com.hd.dao.CustomerMapper;
import com.hd.dao.HealthMapper;
import com.hd.dao.UserMapper;
import com.hd.entity.Customer;
import com.hd.entity.Health;
import com.hd.entity.po.CustomerListPo;
import com.hd.entity.request.CustomerInsertRequest;
import com.hd.entity.request.CustomerModifyRequest;
import com.hd.entity.response.customerListResponse;
import com.hd.service.ICustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {


    @Resource
    private CustomerMapper customerMapper;

    @Resource
    private UserMapper userMapper;

    @Resource
    private HealthMapper healthMapper;

    /**
     * 查询出客户的信息
     * @return
     */
    @Override
    public customerListResponse selectCustomerList(String name) {
        //创建返回值对象
        customerListResponse response = new customerListResponse();
        //查询出所有的符合条件的客户的信息
        List<Customer> list = customerMapper.selectCustomerList(name);
        //创建response的接受参数的List
        List<CustomerListPo> listPos = new ArrayList<>();
        //开始循环查出的List
        for(Customer customer:list){
            //创建一个对象
            CustomerListPo po = new CustomerListPo();
            //根据id查询出客户的角色名字
            String roleName = customerMapper.selectRoleName(customer.getId());
            //开始赋值
            po.setId(customer.getId());
            po.setChannel(customer.getChannel());
            po.setAddress(customer.getAddress());
            po.setIndustry(customer.getIndustry());
            po.setName(customer.getName());
            po.setRole(roleName);
            po.setCreateTime(customer.getCreateTime());
            po.setPhone(customer.getPhone());
            listPos.add(po);
        }
        //为response赋值
        response.setData(listPos);
        return response;
    }

    /**
     * 添加客户的方法
     * @param request
     * @return
     */
    @Override
    public int insertCustomer(CustomerInsertRequest request) {
        //在客户表中插入数据
        int a = customerMapper.insertCustomer(request);
        //查询出最新插入的客户的id
        String newCustomerId = userMapper.selectCustomerNewId();
        //查询出客户的角色的id
        String roleId = userMapper.selectRoleId(request.getCustomerRole());
        //在客户和角色关系表中插入关系

        userMapper.insertCustomerAndRole(roleId,newCustomerId);
        return a;
    }

    /**
     * 删除用户的方法
     * @param id
     * @return
     */
    @Override
    public int deleteCustomer(String id) {
        //删除客户表
        int a= customerMapper.deleteCustomer(id);
        //删除客户和角色关系表的数据
        userMapper.deleteRoleId(id);
        //删除客户的健康表的数据
        healthMapper.deleteHealthAndCustomer(id);
        return a;
    }

    /**
     * 修改用户的方法
     * @param request
     * @return
     */
    @Override
    public int modifyCustomer(CustomerModifyRequest request) {
        //修改客户表的基本信息
        int a = customerMapper.updateCustomer(request);
        //查询该客户的以前的角色
        String oldRole = customerMapper.selectRoleName(request.getId());
        //判断是否和现在的角色相等
        if(!oldRole.equals(request.getCustomerRole())){
            //查询出最新的角色id
           String id =  userMapper.selectRoleId(request.getCustomerRole());
           //添加到角色和客户的关系表中
           userMapper.modifyRoleId(id,request.getId());
        }
        return a;
    }

    /**
     * 查询出所有的为分配身体表的customer
     * @return
     */
    @Override
    public List<String> selectAllCustomer() {
        List<Customer> customerList = customerMapper.selectAllCustomer();
        List<String> list = new ArrayList<>();
        for(Customer customer :customerList){
            List<Health> healthList = healthMapper.selectCustomerId(customer.getId());
            if(healthList.size() == 0){
                list.add(customer.getName());
            }
        }
        return list;
    }

    @Override
    public List<String> selectCustomerEmailList() {
        return customerMapper.selectCustomerEmailList();
    }


}
