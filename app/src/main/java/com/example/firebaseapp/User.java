package com.example.firebaseapp;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class User extends BaseObservable {
    String userName;
    String phoneNumber;
    String group;

    public User(String userName, String phoneNumber, String group) {
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.group = group;
    }

    public User() {
    }

    @Bindable
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        notifyPropertyChanged(BR.userName);
    }

    @Bindable
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        notifyPropertyChanged(BR.phoneNumber);
    }

    @Bindable
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
        notifyPropertyChanged(BR.group);
    }
}
