package com.blog.dao;

import com.blog.entity.IllegalKeywords;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IllegalKeywordsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table illegal_keywords
     *
     * @mbggenerated Sun Jun 25 18:25:18 CST 2017
     */
    int deleteByPrimaryKey(Integer keywordsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table illegal_keywords
     *
     * @mbggenerated Sun Jun 25 18:25:18 CST 2017
     */
    int insert(IllegalKeywords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table illegal_keywords
     *
     * @mbggenerated Sun Jun 25 18:25:18 CST 2017
     */
    int insertSelective(IllegalKeywords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table illegal_keywords
     *
     * @mbggenerated Sun Jun 25 18:25:18 CST 2017
     */
    IllegalKeywords selectByPrimaryKey(Integer keywordsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table illegal_keywords
     *
     * @mbggenerated Sun Jun 25 18:25:18 CST 2017
     */
    int updateByPrimaryKeySelective(IllegalKeywords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table illegal_keywords
     *
     * @mbggenerated Sun Jun 25 18:25:18 CST 2017
     */
    int updateByPrimaryKey(IllegalKeywords record);

    List<IllegalKeywords> selectAll();

}