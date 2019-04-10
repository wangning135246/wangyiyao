package com.hd.controller;


import com.hd.entity.User;
import com.hd.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("login")
public class LoginController {

    @Resource
    IUserService userService;

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("main/login");
        return modelAndView;
    }

    /**
     * 这个是登陆的方法
     * @param account
     * @param password
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public User login(String account,String password){
        return userService.login(account,password);
    }


}
