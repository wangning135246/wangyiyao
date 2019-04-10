package com.hd.controller.customer;


import com.hd.entity.request.CustomerInsertRequest;
import com.hd.entity.request.CustomerModifyRequest;
import com.hd.entity.response.customerListResponse;
import com.hd.service.ICustomerService;
import com.hd.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Resource
    private ICustomerService customerService;

    @Resource
    private IUserService userService;

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView view = new ModelAndView("customer/CustomerList");
        return view;
    }

    @RequestMapping("/addIndex")
    public ModelAndView addIndex(){
        ModelAndView view = new ModelAndView("customer/addCustomer");
        List<String> list = userService.selectAllRole();
        List<String> sexList = new ArrayList<>();
        sexList.add("男");
        sexList.add("女");
        view.addObject("list",list);
        view.addObject("sexList",sexList);
        return view;
    }


    @RequestMapping("/modifyIndex")
    public ModelAndView modifyIndex(String id,String name,String channel,String industry,String phone,String address){
        ModelAndView view = new ModelAndView("customer/updateCustomer");
        List<String> list = userService.selectAllRole();
        view.addObject("id",id);
        view.addObject("name",name);
        view.addObject("channel",channel);
        view.addObject("industry",industry);
        view.addObject("phone",phone);
        view.addObject("address",address);
        view.addObject("list",list);
        return view;
    }

    /**
     * 查询客户信息的List
     * @return
     */
    @RequestMapping("/selectCustomerList")
    @ResponseBody
    public customerListResponse selectCustomerList(String name){
        return customerService.selectCustomerList(name);
    }

    /**
     * 添加客户
     * @param request
     * @return
     */
    @RequestMapping("/insertCustomer")
    @ResponseBody
    public int insertCustomer(CustomerInsertRequest request){
        return customerService.insertCustomer(request);
    }

    /**
     * 修改客户
     * @param request
     * @return
     */
    @RequestMapping("/modifyCustomer")
    @ResponseBody
    public int modifyCustomer(CustomerModifyRequest request){
        return customerService.modifyCustomer(request);
    }

    /**
     * 删除客户
     * @param id
     * @return
     */
    @RequestMapping("/deleteCustomer")
    @ResponseBody
    public int deleteCustomer(String id){
        return customerService.deleteCustomer(id);
    }

}
