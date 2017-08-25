package com.blog.util;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 * Created by 覃玉初 on 2017/8/1.
 */
@Repository
public class UtilChangeSqlDate {

    public Timestamp getSqlDate() {
        java.util.Date date = new java.util.Date();
        String dateTime=null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateTime = simpleDateFormat.format(date);
        Timestamp timestamp=Timestamp.valueOf(dateTime);
        return timestamp;
    }
}
