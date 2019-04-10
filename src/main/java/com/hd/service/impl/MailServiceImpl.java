package com.hd.service.impl;

import com.hd.dao.CustomerMapper;
import com.hd.entity.Mail;
import com.hd.entity.response.HealthListResponse;
import com.hd.service.IMailService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import java.util.Properties;


@Service
public class MailServiceImpl implements IMailService {

    @Resource
    private CustomerMapper customerMapper;

    @Resource
    private HealthServiceImpl healthService;

    /**
     * 发送邮件
     * @param mail
     * @throws MessagingException
     */
    @Override
    public void sendEmail(Mail mail) throws MessagingException {
        Properties properties = new Properties();
        properties.setProperty("mail.smtp.host",mail.getHost());
        properties.setProperty("mail.transport.protocol","smtp");
        properties.setProperty("mail.smtp.auth","true");
        properties.setProperty("mail.Debug","true");
        Session session = Session.getInstance(properties);
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(mail.getFrom()));
        message.setRecipients(Message.RecipientType.TO,new InternetAddress[]{new InternetAddress(mail.getTo())});
        message.setSubject(mail.getSubject());
        message.setText(mail.getText());
        Transport transport = session.getTransport();
        transport.connect(mail.getFrom(),mail.getPwd());
        transport.sendMessage(message,message.getAllRecipients());
        transport.close();
    }

    /**
     * 创建邮件
     * @param text
     * @param userName
     * @return
     */
    @Override
    public Mail createMail(String text,String userName) {
        String mailAddress = customerMapper.selectCustomerEmail(userName);
        Mail mail = new Mail();
        mail.setTo(mailAddress);
        mail.setText(text);
        return mail;
    }

    /**
     * 创建邮件模版
     * @return
     */
    @Override
    public String createText(String name) {
        HealthListResponse response =  healthService.selectHealthList(name);
        String str = "尊敬的顾客您好：以下是您的身体的一些数据情况以及结果。";
        String str1 = "心率："+response.getData().get(0).getHeartRate();
        String str2 = "血压："+response.getData().get(0).getBloodPressure();
        String str3 = "胆固醇："+response.getData().get(0).getCholesterol();
        String str4 = "血糖："+response.getData().get(0).getBloodsugar();
        String str5 = "身体情况："+response.getData().get(0).getPhysicalCondition();
        String speak = null;
        String speak1 = null;
        String speak2 = null;
        if(response.getData().get(0).getBloodPressure().equals("血压正在升高")){
             speak = "血压正在升高，这时候不要过于焦虑，通过改善饮食，血压会马上降下去。";
        }else if(response.getData().get(0).getBloodPressure().equals("高血压")){
             speak = "患上了高血压，需要借助药物治疗来降低血压，也提醒人们在平常的生活当中，要注意体育锻炼和饮食的清淡。";
        }else{
            speak = "血压正常";
        }
        String str6 = "建议1,血压情况："+speak;
        if ((Double.parseDouble(response.getData().get(0).getBloodsugar()) < 3.9) || (Double.parseDouble(response.getData().get(0).getBloodsugar()) > 6.1)) {
             speak1 = "这个数据非常重要，是否患有糖尿病和这个数据息息相关，对于糖尿病患者来说，平常的饮食控制占主要部分。因为病从口入，在饮食上讲究合理平衡、营养充足，血糖就会慢慢降低";
        }else{
             speak1 = "血糖正常";
        }
        String str7 = "建议2,血糖情况："+speak1;
        if(response.getData().get(0).getPhysicalCondition().equals("偏瘦")){
            speak2 = "您需要注意正常规律的饮食习惯";
        }else if(response.getData().get(0).getPhysicalCondition().equals("超重")){
            speak2 = "再不锻炼你就肥胖了哦";
        }else if(response.getData().get(0).getPhysicalCondition().equals("肥胖")){
            speak2 = "您现在肥胖，请您过来锻炼";
        }else{
            speak2 = "您的身体正常，注意锻炼";
        }
        String str8 = "建议3,身体情况："+speak2;
        String ok=str+"\n"+str1+"\n"+str2+"\n"+str3+"\n"+str4+"\n"+str5+"\n"+str6+"\n"+str7+"\n"+str8+"\n";
        return ok;
    }

}
