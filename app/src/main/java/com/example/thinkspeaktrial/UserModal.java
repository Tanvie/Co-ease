package com.example.thinkspeaktrial;

/**
 * Created by Tanvi Wakade on 22-05-2021.
 */
public class UserModal {
    // variables for our first name, 
    // last name, email and avatar
    private String bedNo;
    private String temp;

    private String oxygen;
    private String pulseRate;

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getOxygen() {
        return oxygen;
    }

    public void setOxygen(String oxygen) {
        this.oxygen = oxygen;
    }

    public String getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(String pulseRate) {
        this.pulseRate = pulseRate;
    }

    public UserModal(String bedNo, String temp, String oxygen, String pulseRate) {
        this.bedNo = bedNo;
        this.temp = temp;
        this.oxygen = oxygen;
        this.pulseRate = pulseRate;
    }
}
