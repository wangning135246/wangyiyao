package com.hd.entity.request;

import java.io.Serializable;

public class HealthAddRequest implements Serializable {

    /**
     * 这个是创建的customerId
     */
    private String customerId;
    /**
     * 这个是心率
     */
    private String heartRate;
    /**
     * 这个是舒张压
     */
    private String diastolicPressure;
    /**
     * 这个是收缩压
     */
    private String systolicPressure;
    /**
     * 这个是胆固醇
     */
    private String cholesterol;
    /**
     * 这个是血糖
     */
    private String bloodsugar;
    /**
     * 这个是体重
     */
    private String weight;
    /**
     * 这个是身高
     */
    private String height;
    /**
     * 这个是腰围
     */
    private String waistline;

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
}
