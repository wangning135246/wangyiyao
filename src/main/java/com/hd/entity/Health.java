package com.hd.entity;

import java.io.Serializable;

public class Health implements Serializable {
    /**
     * 健康表的id
     */
    private String id;
    /**
     * 客户表的id
     */
    private String customerId;
    /**
     * 客户端的心率
     */
    private String heartRate;
    /**
     * 客户的舒张压
     */
    private String diastolicPressure;
    /**
     * 客户的收缩压
     */
    private String systolicPressure;
    /**
     * 客户的胆固醇
     */
    private String cholesterol;
    /**
     * 客户的血糖
     */
    private String bloodsugar;
    /**
     * 客户的体重
     */
    private String weight;
    /**
     * 客户的身高
     */
    private String height;
    /**
     * 客户的腰围
     */
    private String waistline;
    /**
     * 创建时间
     */
    private String createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(String heartRate) {
        this.heartRate = heartRate;
    }

    public String getDiastolicPressure() {
        return diastolicPressure;
    }

    public void setDiastolicPressure(String diastolicPressure) {
        this.diastolicPressure = diastolicPressure;
    }

    public String getSystolicPressure() {
        return systolicPressure;
    }

    public void setSystolicPressure(String systolicPressure) {
        this.systolicPressure = systolicPressure;
    }

    public String getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(String cholesterol) {
        this.cholesterol = cholesterol;
    }

    public String getBloodsugar() {
        return bloodsugar;
    }

    public void setBloodsugar(String bloodsugar) {
        this.bloodsugar = bloodsugar;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWaistline() {
        return waistline;
    }

    public void setWaistline(String waistline) {
        this.waistline = waistline;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
