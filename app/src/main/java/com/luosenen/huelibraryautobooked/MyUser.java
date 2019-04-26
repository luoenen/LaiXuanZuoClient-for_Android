package com.luosenen.huelibraryautobooked;


import cn.bmob.v3.BmobUser;

public class MyUser extends BmobUser {

    private String floor;
    private String seat_X;
    private String seat_Y;
    private String isBooked;
    private String bookedTime;

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getSeat_X() {
        return seat_X;
    }

    public void setSeat_X(String seat_X) {
        this.seat_X = seat_X;
    }

    public String getSeat_Y() {
        return seat_Y;
    }

    public void setSeat_Y(String seat_Y) {
        this.seat_Y = seat_Y;
    }

    public String getIsBooked() {
        return isBooked;
    }

    public void setIsBooked(String isBooked) {
        this.isBooked = isBooked;
    }

    public String getBookedTime() {
        return bookedTime;
    }

    public void setBookedTime(String bookedTime) {
        this.bookedTime = bookedTime;
    }
}
