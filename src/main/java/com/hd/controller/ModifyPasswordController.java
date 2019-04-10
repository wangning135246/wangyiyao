package com.hd.controller;


import com.hd.service.impl.ModifyPasswordServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/modifyPassword")
public class ModifyPasswordController {

    @Resource
    private ModifyPasswordServiceImpl modifyPasswordService;

    @RequestMapping("/index")
    public ModelAndView index(String userId){
        ModelAndView view = new ModelAndView("main/modifyPassword");
        view.addObject("userId",userId);
        return view;
    }

    @RequestMapping("/updatePassword")
    @ResponseBody
    public int modifyPassword(String oldPassword,String password,String userId){
            return modifyPasswordService.modifyPassword(oldPassword,password,userId);
    }

}
