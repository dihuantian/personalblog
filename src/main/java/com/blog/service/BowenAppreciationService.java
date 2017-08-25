package com.blog.service;

import com.blog.entity.BowenAppreciation;
import com.blog.entity.BowenClassification;

import java.util.List;

/**
 * Created by 覃玉初 on 2017/8/2.
 */

public interface BowenAppreciationService {

    List<BowenAppreciation> getRangeBowenComment(int page);

    int deleteSpecifyBowenComment(int commentId);
}
