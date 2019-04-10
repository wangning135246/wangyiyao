package com.hd.entity.request;

import java.io.Serializable;

public class HealthModifyRequest implements Serializable {
    /**
     * 这个是health的id
     */
    private String healthId;
    /**
     * 这个是心率
     */
    private String heartRate;
    /**
     * 这个是胆固醇
     */
    private String cholesterol;
    /**
     * 这个是血糖
     */
    private String bloodsugar;

    public String getHealthId() {
        return healthId;
    }

    public void setHealthId(String healthId) {
        this.healthId = healthId;
    }

    public String getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(String heartRate) {
        this.heartRate = heartRate;
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

}
