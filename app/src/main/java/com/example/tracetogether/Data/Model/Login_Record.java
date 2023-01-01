package com.example.tracetogether.Data.Model;

public class Login_Record {

    private String name;
    private String ic;
    private String phoneNo;
    private String depName;
    private String depIc;
    private String depPhoneNo;

    public Login_Record() {

    }

    public Login_Record(String name, String ic, String phoneNo) {
        this.name = name;
        this.ic = ic;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepIc() {
        return depIc;
    }

    public void setDepIc(String depIc) {
        this.depIc = depIc;
    }

    public String getDepPhoneNo() {
        return depPhoneNo;
    }

    public void setDepPhoneNo(String depPhoneNo) {
        this.depPhoneNo = depPhoneNo;
    }
}
