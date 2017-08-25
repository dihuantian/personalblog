package com.blog.serviceImpl;

import com.blog.dao.BowenAppreciationMapper;
import com.blog.entity.BowenAppreciation;
import com.blog.entity.BowenClassification;
import com.blog.service.BowenAppreciationService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 覃玉初 on 2017/8/2.
 */
@Service
public class BowenAppreciationServiceImpl implements BowenAppreciationService {

    @Resource
    private BowenAppreciationMapper bowenAppreciationMapper;

    private final int limit = 5;

    public List<BowenAppreciation> getRangeBowenComment(int page) {
        int start = 0, end = 0;
        start = ((page - 1) * limit);
        end = page * limit;
        List<BowenAppreciation> appreciationList = bowenAppreciationMapper.selectRangeAll(start, end);
        if (appreciationList.size() != 0) {

            return appreciationList;
        }
        return null;
    }



    public int deleteSpecifyBowenComment(int commentId) {


        return bowenAppreciationMapper.deleteByPrimaryKey(commentId);
    }

}
