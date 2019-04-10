package com.hd.service;

import com.hd.entity.Mail;

import javax.mail.MessagingException;

public interface IMailService {

     void sendEmail(Mail mail) throws MessagingException;

      Mail createMail(String text,String userName);

      String createText(String name);
}
