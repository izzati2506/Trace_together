package com.example.tracetogether.Data.Model;

public class CheckIn_Record {

    private String user_name;
    private String user_nric;
    private String move_Day;
    private String move_Date;
    private String move_CheckInTime;
    private String place_Name;

    public CheckIn_Record() {}

    public CheckIn_Record(String user_name, String user_nric, String move_Day, String move_Date, String move_CheckInTime, String place_Name){
        this.user_name = user_name;
        this.user_nric = user_nric;
    }

    public String getUserName() {
        return user_name;
    }

    public void setUserName(String user_name) {
        this.user_name = user_name;
    }

    public String getUserNRIC() {
        return user_nric;
    }

    public void setUserNRIC(String user_nric) {
        this.user_nric = user_nric;
    }

    public String getMove_Day() {
        return move_Day;
    }

    public void setMove_Day(String move_Day) {
        this.move_Day = move_Day;
    }

    public String getMove_Date() {
        return move_Date;
    }

    public void setMove_Date(String move_Date) {
        this.move_Date = move_Date;
    }
    public String getMove_CheckInTime() {
        return move_CheckInTime;
    }

    public void setMove_CheckInTime(String move_CheckInTime) {
        this.move_CheckInTime = move_CheckInTime;
    }
    public String getPlace_Name() {
        return place_Name;
    }

    public void setPlace_Name(String place_Name) {
        this.place_Name = place_Name;
    }


}
