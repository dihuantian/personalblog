package com.blog.dao;

import com.blog.entity.BowenAppreciation;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BowenAppreciationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bowen_appreciation
     *
     * @mbggenerated Fri Jun 23 16:50:23 CST 2017
     */
    int deleteByPrimaryKey(Integer appreciationid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bowen_appreciation
     *
     * @mbggenerated Fri Jun 23 16:50:23 CST 2017
     */
    int insert(BowenAppreciation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bowen_appreciation
     *
     * @mbggenerated Fri Jun 23 16:50:23 CST 2017
     */
    int insertSelective(BowenAppreciation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bowen_appreciation
     *
     * @mbggenerated Fri Jun 23 16:50:23 CST 2017
     */
    BowenAppreciation selectByPrimaryKey(Integer appreciationid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bowen_appreciation
     *
     * @mbggenerated Fri Jun 23 16:50:23 CST 2017
     */
    int updateByPrimaryKeySelective(BowenAppreciation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bowen_appreciation
     *
     * @mbggenerated Fri Jun 23 16:50:23 CST 2017
     */
    int updateByPrimaryKey(BowenAppreciation record);

    List<BowenAppreciation> selectRangeAll(int start,int end);
}