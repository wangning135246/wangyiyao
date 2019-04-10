package com.hd.controller.analysis;


import com.hd.entity.response.CustomerAnalysisResponse;
import com.hd.service.impl.AnalysisServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/analysis")
public class AnalysisController {

    @Resource
    private AnalysisServiceImpl analysisService;

    /**
     * 这个是查询Customer折线图的方法
     * @return
     */
    @RequestMapping("/selectCustomer")
    @ResponseBody
    public CustomerAnalysisResponse selectCustomer(){
        return analysisService.selectCustomer();
    }
}
