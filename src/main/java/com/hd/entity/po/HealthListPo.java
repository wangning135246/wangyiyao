package com.hd.entity.po;

import java.io.Serializable;

public class HealthListPo implements Serializable {

    /**
     * 客户的id
     */
    private String id;
    /**
     * 客户的名字
     */
    private String name;
    /**
     * 客户的性别
     */
    private String sex;
    /**
     * 客户的心率
     */
    private String heartRate;
    /**
     * 客户的血压
     */
    private String bloodPressure;
    /**
     * 客户的胆固醇
     */
    private String cholesterol;
    /**
     * 客户的血糖
     */
    private String bloodsugar;
    /**
     * 身体情况
     */
    private String physicalCondition;
    /**
     * 客户的腰围
     */
    private String waistline;
    /**
     * 创建时间
     */
    private String createtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(String heartRate) {
        this.heartRate = heartRate;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
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

    public String getPhysicalCondition() {
        return physicalCondition;
    }

    public void setPhysicalCondition(String physicalCondition) {
        this.physicalCondition = physicalCondition;
    }

    public String getWaistline() {
        return waistline;
    }

    public void setWaistline(String waistline) {
        this.waistline = waistline;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }
}
