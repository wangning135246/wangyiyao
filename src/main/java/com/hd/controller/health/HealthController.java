package com.hd.controller.health;


import com.hd.entity.request.HealthAddRequest;
import com.hd.entity.request.HealthModifyRequest;
import com.hd.entity.response.HealthListResponse;
import com.hd.service.impl.CustomerServiceImpl;
import com.hd.service.impl.HealthServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/health")
public class HealthController {

    @Resource
    private HealthServiceImpl healthService;

    @Resource
    private CustomerServiceImpl customerService;

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView view = new ModelAndView("health/HealthList");
        return view;
    }

    @RequestMapping("/addIndex")
    public ModelAndView addIndex(){
        List<String> list = customerService.selectAllCustomer();
        ModelAndView view = new ModelAndView("health/AddHealth");
        view.addObject("list",list);
        return view;
    }

    @RequestMapping("/modifyIndex")
    public ModelAndView modifyIndex(String id,String heartRate,String cholesterol,String bloodsugar){
        ModelAndView view = new ModelAndView("health/updateHealth");
        view.addObject("id",id);
        view.addObject("heartRate",heartRate);
        view.addObject("cholesterol",cholesterol);
        view.addObject("bloodsugar",bloodsugar);
        return view;
    }

    /**
     * 查询health的信息
     * @param name
     * @return
     */
    @RequestMapping("/selectHealthList")
    @ResponseBody
    public HealthListResponse selectHealthList(String name){
        return healthService.selectHealthList(name);
    }

    /**
     * 修改health
     * @param request
     * @return
     */
    @RequestMapping("/modifyHealth")
    @ResponseBody
    public int modifyHealth(HealthModifyRequest request){
        return healthService.modifyHealth(request);
    }

    /**
     * 添加health
     * @param request
     * @return
     */
    @RequestMapping("/addHealth")
    @ResponseBody
    public int addHealth(HealthAddRequest request){
        return healthService.addHealth(request);
    }

}
