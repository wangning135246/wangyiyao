package com.hd.entity;

import java.io.Serializable;

public class Mail implements Serializable {
    //发信方
    private final String from = "644716132@qq.com";
    //访问码
    private final String pwd = "mxnuwlwvwadtbdga";
    //smtp服务器
    private final String host = "smtp.qq.com";
    //标题
    private final String Subject = "欢迎您使用本公司的养生管理系统：";
    //接收方
    private String to ;
    //邮件内容
    private String text;

    public String getSubject() {
        return Subject;
    }

    public String getFrom() {
        return from;
    }

    public String getPwd() {
        return pwd;
    }

    public String getHost() {
        return host;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
