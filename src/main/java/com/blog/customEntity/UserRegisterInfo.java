package com.blog.customEntity;

import java.util.Date;

/**
 * Created by 覃玉初 on 2017/6/24.
 */
public class UserRegisterInfo {

    private String userName;
    private String password;
    private boolean userLimit;
    private String userAvatar;
    private Date registerTime;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getUserLimit() {
        return userLimit;
    }

    public void setUserLimit(boolean userLimit) {
        this.userLimit = userLimit;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }
}
