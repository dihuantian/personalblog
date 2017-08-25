package com.blog.dao;

import com.blog.entity.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Fri Jun 23 16:50:22 CST 2017
     */
    int deleteByPrimaryKey(Integer userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Fri Jun 23 16:50:22 CST 2017
     */
    int insert(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Fri Jun 23 16:50:22 CST 2017
     */
    int insertSelective(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Fri Jun 23 16:50:22 CST 2017
     */
    UserInfo selectByPrimaryKey(Integer userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Fri Jun 23 16:50:22 CST 2017
     */
    int updateByPrimaryKeySelective(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Fri Jun 23 16:50:22 CST 2017
     */
    int updateByPrimaryKey(UserInfo record);

    UserInfo selectByUserName(String userName);

    List<UserInfo> selectReverseInquire(@Param("userInfoList") List<UserInfo> userInfoList);

    List<UserInfo> selectAll();
}