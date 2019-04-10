package com.hd.dao;

import com.hd.entity.Customer;
import com.hd.entity.request.CustomerInsertRequest;
import com.hd.entity.request.CustomerModifyRequest;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerMapper {

    /**
     * 查询出角色的名字
     * @param customerId
     * @return
     */
   String  selectRoleName(@Param("customerId")String customerId);

    /**
     * 查询customer的所有的信息
     * @return
     */
   List<Customer> selectCustomerList(@Param("name")String name);

    /**
     * 根据角色查询客户的信息
     * @param name
     * @return
     */
    List<Customer> selectAllCustomerRole(@Param("name")String name);

    /**
     * 添加客户的方法
     * @return
     */
    int insertCustomer(CustomerInsertRequest request);

    /**
     * 删除客户的方法
     * @return
     */
    int deleteCustomer(@Param("id")String id);

    /**
     * 修改客户的方法
     * @return
     */
    int updateCustomer(CustomerModifyRequest request);

    /**
     * 查询健康表对应的客户
     * @param name
     * @return
     */
    List<Customer> selectHealthCustomer(@Param("name")String name);


    /**
     * 查询客户的id
     * @param name
     * @return
     */
    String selectCustomerId(@Param("name")String name);

    /**
     * 为下拉列表赋值
     */
    List<Customer> selectAllCustomer();

  /**
  * 查询用户的email
  * @param customerName
  * @return
  */
 String selectCustomerEmail(@Param("customerName")String customerName);

 /**
  * 查询出所有的客人的名字
  * @return
  */
  List<String> selectCustomerEmailList();
}
