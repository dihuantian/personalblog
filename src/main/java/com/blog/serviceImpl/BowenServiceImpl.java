package com.blog.serviceImpl;

import com.blog.dao.BowenClassificationMapper;
import com.blog.dao.BowenMapper;
import com.blog.entity.Bowen;
import com.blog.service.BowenService;
import com.blog.service.IllegalKeywordsService;
import com.blog.util.UtilChangeSqlDate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by 覃玉初 on 2017/6/29.
 */
@Service
public class BowenServiceImpl implements BowenService {

    private final int limit = 5;

    @Resource
    private IllegalKeywordsService illegalKeywordsService;

    @Resource
    private BowenMapper bowenMapper;

    @Resource
    private BowenClassificationMapper bowenClassificationMapper;

    /*
    * 保存博文
    * */
    public boolean bowenSave(Bowen bowen) {

        UtilChangeSqlDate utilChangeSqlDate=new UtilChangeSqlDate();
        bowen.setBowencreatetime(utilChangeSqlDate.getSqlDate());
        boolean titleCorrect, contentCorrect;
        titleCorrect = illegalKeywordsService.keywordsJudgment(bowen.getBowentitle());
        contentCorrect = illegalKeywordsService.keywordsJudgment(bowen.getBowencontent());
        if (titleCorrect == true && contentCorrect == true) {
            if (bowenMapper.insert(bowen) > 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /*
    * 删除博文
    * */
    public boolean bowenDelete(int bowenId) {

        if (bowenMapper.deleteByPrimaryKey(bowenId) > 0) {
            return true;
        } else {
            return false;
        }
    }

    /*
    * 获取所有博文
    * */
    public List<Bowen> getAllBowen() {

        List<Bowen> bowenList = bowenMapper.selectAll();
        if (bowenList != null) {
            return bowenList;
        } else {
            return null;
        }
    }

    /*
    * 获取指定几条到几条数据记录
    * */
    public List<Bowen> getRangeBowen(int pages) {
        final int grow = 5;
        int start, end;
        start = (pages - 1) * grow;
        end = pages * grow;
        List<Bowen> bowenList = bowenMapper.selectByRange(start, end);
        if (bowenList != null) {
            return bowenList;
        } else {
            return null;
        }
    }

    /*
    * 获取指定博文文章
    * */
    public Bowen getBowen(int bowenId) {
        Bowen bowen = bowenMapper.selectByPrimaryKey(bowenId);
        if (bowen != null) {
            return bowen;
        } else {
            return null;
        }
    }

    /*
    * 返回数据库中博文的总数
    * */
    public int getBowenQuantity() {
        int bowenQuantity = 0, limit = 5;
        bowenQuantity = bowenMapper.selectAllQuantity();
        bowenQuantity = (bowenQuantity / limit) + bowenQuantity % limit;
        return bowenQuantity;
    }

    /*
    * 获取随机博文
    * */
    public List<Bowen> randomArray(List<Bowen> allBowen) {

        int size = allBowen.size(), i = 0, randomNum = 0;
        List<Bowen> array = new ArrayList<Bowen>();
        Random random = new Random();
        while (array.size() != 5) {
            size = allBowen.size();
            randomNum = random.nextInt(size);
            array.add(allBowen.get(randomNum));
            allBowen.remove(randomNum);
        }

        return array;
    }


}
