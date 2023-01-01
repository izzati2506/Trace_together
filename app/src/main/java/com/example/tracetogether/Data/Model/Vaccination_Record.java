package com.example.tracetogether.Data.Model;

public class Vaccination_Record {

    private String name;
    private String phoneNo;
    private String ic;
    private String vacType;
    private String vacLocation;
    private String vacDate;
    private String vacTime;

    public Vaccination_Record() {}

    public Vaccination_Record(String name, String phoneNo, String ic) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.ic = ic;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public String getVacType() { return vacType; }

    public void setVacType(String vacType) {
        this.vacType = vacType;
    }

    public String getVacLocation() {
        return vacLocation;
    }

    public void setVacLocation(String vacLocation) {
        this.vacLocation = vacLocation;
    }

    public String getVacDate() {
        return vacDate;
    }

    public void setVacDate(String vacDate) {
        this.vacDate = vacDate;
    }

    public String getVacTime() {
        return vacTime;
    }

    public void setVacTime(String vacTime) {
        this.vacTime = vacTime;
    }
}
