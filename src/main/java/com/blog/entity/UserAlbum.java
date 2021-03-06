package com.blog.entity;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public class UserAlbum implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_album.albumId
     *
     * @mbggenerated Fri Jun 23 16:50:23 CST 2017
     */
    private Integer albumid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_album.userId
     *
     * @mbggenerated Fri Jun 23 16:50:23 CST 2017
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_album.albumName
     *
     * @mbggenerated Fri Jun 23 16:50:23 CST 2017
     */
    private String albumname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_album.ablumCapacity
     *
     * @mbggenerated Fri Jun 23 16:50:23 CST 2017
     */
    private Integer ablumcapacity;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_album.albumId
     *
     * @return the value of user_album.albumId
     *
     * @mbggenerated Fri Jun 23 16:50:23 CST 2017
     */
    public Integer getAlbumid() {
        return albumid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_album.albumId
     *
     * @param albumid the value for user_album.albumId
     *
     * @mbggenerated Fri Jun 23 16:50:23 CST 2017
     */
    public void setAlbumid(Integer albumid) {
        this.albumid = albumid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_album.userId
     *
     * @return the value of user_album.userId
     *
     * @mbggenerated Fri Jun 23 16:50:23 CST 2017
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_album.userId
     *
     * @param userid the value for user_album.userId
     *
     * @mbggenerated Fri Jun 23 16:50:23 CST 2017
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_album.albumName
     *
     * @return the value of user_album.albumName
     *
     * @mbggenerated Fri Jun 23 16:50:23 CST 2017
     */
    public String getAlbumname() {
        return albumname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_album.albumName
     *
     * @param albumname the value for user_album.albumName
     *
     * @mbggenerated Fri Jun 23 16:50:23 CST 2017
     */
    public void setAlbumname(String albumname) {
        this.albumname = albumname == null ? null : albumname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_album.ablumCapacity
     *
     * @return the value of user_album.ablumCapacity
     *
     * @mbggenerated Fri Jun 23 16:50:23 CST 2017
     */
    public Integer getAblumcapacity() {
        return ablumcapacity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_album.ablumCapacity
     *
     * @param ablumcapacity the value for user_album.ablumCapacity
     *
     * @mbggenerated Fri Jun 23 16:50:23 CST 2017
     */
    public void setAblumcapacity(Integer ablumcapacity) {
        this.ablumcapacity = ablumcapacity;
    }
}