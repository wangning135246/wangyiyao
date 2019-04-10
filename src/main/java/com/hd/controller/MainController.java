package com.hd.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/success")
public class MainController {


    @RequestMapping("/index")
    public ModelAndView index(String userId){
        ModelAndView modelAndView = new ModelAndView("main/index");
        modelAndView.addObject("userId",userId);
        return modelAndView;
    }

    @RequestMapping("/welcome")
    public ModelAndView welcome(){
        ModelAndView modelAndView = new ModelAndView("main/welcome");
        return modelAndView;
    }

    @RequestMapping("/modifyPassword")
    public ModelAndView modifyPassword(){
        ModelAndView modelAndView = new ModelAndView("main/modifyPassword");
        return modelAndView;
    }

}
