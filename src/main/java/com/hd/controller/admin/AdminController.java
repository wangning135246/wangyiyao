package com.hd.controller.admin;


import com.hd.entity.request.AdminAddRequest;
import com.hd.entity.request.AdminModifyRequest;
import com.hd.entity.response.AdminListResponse;
import com.hd.service.impl.AdminServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Resource
    private AdminServiceImpl adminService;

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView view = new ModelAndView("admin/AdminList");
        return view;
    }

    /**
     * 这个是添加管理员的方法
     * @return
     */
    @RequestMapping("/addIndex")
    public ModelAndView addIndex(){
        List<String> roleName = new ArrayList<>();
        roleName.add("超级管理员");
        roleName.add("普通管理员");
        ModelAndView view = new ModelAndView("admin/AddAdmin");
        view.addObject("roleName",roleName);
        return view;
    }

    /**
     * 这个是添加管理员的方法
     * @return
     */
    @RequestMapping("/modifyIndex")
    public ModelAndView modifyIndex(String id,String phone,String name,String account,String address){
        List<String> roleName = new ArrayList<>();
        roleName.add("超级管理员");
        roleName.add("普通管理员");
        ModelAndView view = new ModelAndView("admin/updateAdmin");
        view.addObject("id",id);
        view.addObject("phone",phone);
        view.addObject("name",name);
        view.addObject("account",account);
        view.addObject("roleName",roleName);
        view.addObject("address",address);
        return view;
    }

    /**
     * 判断管理员的权限够不够
     * @param userId
     * @return
     */
    @RequestMapping("/adminPower")
    @ResponseBody
    public int adminPower(String userId){
        return adminService.adminPower(userId);
    }

    /**
     * 查询管理员的方法
     * @param adminName
     * @return
     */
    @RequestMapping("/selectAdminList")
    @ResponseBody
    public AdminListResponse selectAdminList(String adminName){
        AdminListResponse response = adminService.selectAdminList(adminName);
        return response;
    }

    /**
     * 这个是添加admin方法
     * @param request
     * @return
     */
    @RequestMapping("/insertAdmin")
    @ResponseBody
    public int insertAdmin(AdminAddRequest request){
        return adminService.addAdmin(request);
    }

    /**
     * 这个是修改admin的方法
     * @param request
     * @return
     */
    @RequestMapping("/modifyAdmin")
    @ResponseBody
    public int modifyAdmin(AdminModifyRequest request){
        return adminService.modifyAdmin(request);
    }

    /**
     * 这个是删除管理员的方法
     * @param id
     * @return
     */
    @RequestMapping("/deleteAdmin")
    @ResponseBody
    public int deleteAdmin(String id){
        return adminService.deleteAdmin(id);
    }

}
