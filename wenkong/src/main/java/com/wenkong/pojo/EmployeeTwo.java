package com.wenkong.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class EmployeeTwo implements Serializable{
    private String name;
    private String department;
    private String stuaddress;
    private String state;
    private String fstate;
    private String contact;
    private String possible;
    private String remark;
    //@DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date creationtime;
    private Date returntime;
    private String Phone;
    private String returnvehicle;
    private String takeno;

    public String getTakeno() {
        return takeno;
    }

    public void setTakeno(String takeno) {
        this.takeno = takeno;
    }
//    //返程时间使用字符串
//    private String returnvehicle2;

//    public String getReturnvehicle2() {
//        return returnvehicle2;
//    }
//
//    public void setReturnvehicle2(String returnvehicle2) {
//        this.returnvehicle2 = returnvehicle2;
//    }

    public Date getReturntime() {
        return returntime;
    }

    public void setReturntime(Date returntime) {
        this.returntime = returntime;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getReturnvehicle() {
        return returnvehicle;
    }

    public void setReturnvehicle(String returnvehicle) {
        this.returnvehicle = returnvehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStuaddress() {
        return stuaddress;
    }

    public void setStuaddress(String stuaddress) {
        this.stuaddress = stuaddress;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getFstate() {
        return fstate;
    }

    public void setFstate(String fstate) {
        this.fstate = fstate;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPossible() {
        return possible;
    }

    public void setPossible(String possible) {
        this.possible = possible;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }
}
