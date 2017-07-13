package com.blog.entity;

import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class UserInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.userId
     *
     * @mbggenerated Fri Jun 23 16:50:22 CST 2017
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.userName
     *
     * @mbggenerated Fri Jun 23 16:50:22 CST 2017
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.password
     *
     * @mbggenerated Fri Jun 23 16:50:22 CST 2017
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.userLimit
     *
     * @mbggenerated Fri Jun 23 16:50:22 CST 2017
     */
    private Boolean userlimit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.career
     *
     * @mbggenerated Fri Jun 23 16:50:22 CST 2017
     */
    private String career;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.introduction
     *
     * @mbggenerated Fri Jun 23 16:50:22 CST 2017
     */
    private String introduction;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.userAvatar
     *
     * @mbggenerated Fri Jun 23 16:50:22 CST 2017
     */
    private String useravatar;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.registerTime
     *
     * @mbggenerated Fri Jun 23 16:50:22 CST 2017
     */
    private Date registertime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.userId
     *
     * @return the value of user_info.userId
     *
     * @mbggenerated Fri Jun 23 16:50:22 CST 2017
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.userId
     *
     * @param userid the value for user_info.userId
     *
     * @mbggenerated Fri Jun 23 16:50:22 CST 2017
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.userName
     *
     * @return the value of user_info.userName
     *
     * @mbggenerated Fri Jun 23 16:50:22 CST 2017
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.userName
     *
     * @param username the value for user_info.userName
     *
     * @mbggenerated Fri Jun 23 16:50:22 CST 2017
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.password
     *
     * @return the value of user_info.password
     *
     * @mbggenerated Fri Jun 23 16:50:22 CST 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.password
     *
     * @param password the value for user_info.password
     *
     * @mbggenerated Fri Jun 23 16:50:22 CST 2017
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.userLimit
     *
     * @return the value of user_info.userLimit
     *
     * @mbggenerated Fri Jun 23 16:50:22 CST 2017
     */
    public Boolean getUserlimit() {
        return userlimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.userLimit
     *
     * @param userlimit the value for user_info.userLimit
     *
     * @mbggenerated Fri Jun 23 16:50:22 CST 2017
     */
    public void setUserlimit(Boolean userlimit) {
        this.userlimit = userlimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.career
     *
     * @return the value of user_info.career
     *
     * @mbggenerated Fri Jun 23 16:50:22 CST 2017
     */
    public String getCareer() {
        return career;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.career
     *
     * @param career the value for user_info.career
     *
     * @mbggenerated Fri Jun 23 16:50:22 CST 2017
     */
    public void setCareer(String career) {
        this.career = career == null ? null : career.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.introduction
     *
     * @return the value of user_info.introduction
     *
     * @mbggenerated Fri Jun 23 16:50:22 CST 2017
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.introduction
     *
     * @param introduction the value for user_info.introduction
     *
     * @mbggenerated Fri Jun 23 16:50:22 CST 2017
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.userAvatar
     *
     * @return the value of user_info.userAvatar
     *
     * @mbggenerated Fri Jun 23 16:50:22 CST 2017
     */
    public String getUseravatar() {
        return useravatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.userAvatar
     *
     * @param useravatar the value for user_info.userAvatar
     *
     * @mbggenerated Fri Jun 23 16:50:22 CST 2017
     */
    public void setUseravatar(String useravatar) {
        this.useravatar = useravatar == null ? null : useravatar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.registerTime
     *
     * @return the value of user_info.registerTime
     *
     * @mbggenerated Fri Jun 23 16:50:22 CST 2017
     */
    public Date getRegistertime() {
        return registertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.registerTime
     *
     * @param registertime the value for user_info.registerTime
     *
     * @mbggenerated Fri Jun 23 16:50:22 CST 2017
     */
    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }
}