package com.hd.controller;


import com.hd.entity.Mail;
import com.hd.service.impl.CustomerServiceImpl;
import com.hd.service.impl.MailServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeBodyPart;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
@RequestMapping("/email")
public class SendEmailController {

    @Resource
    private CustomerServiceImpl customerService;

    @Resource
    private MailServiceImpl mailService;

    @RequestMapping("/index")
    public ModelAndView index(){
        List<String> list = customerService.selectCustomerEmailList();
        ModelAndView  view = new ModelAndView("health/sendEmail");
        view.addObject("list",list);
        return view;
    }

    @RequestMapping("/sendEmail")
    @ResponseBody
    public int sendEmail(String customerName,String comments) throws MessagingException, UnsupportedEncodingException {
        MimeBodyPart body = new MimeBodyPart();
        String ok =  mailService.createText(customerName);
        String noProblem = ok+"备注："+comments;
        body.setContent(noProblem, "text/html;charset=GB2312");
        Mail mail= mailService.createMail(noProblem,customerName);
       if(mail != null){
           mailService.sendEmail(mail);
           return 0;
       }else {
           return 1;
       }
    }

}
