package com.blog.serviceImpl;

import com.blog.dao.BowenClassificationMapper;
import com.blog.dao.BowenMapper;
import com.blog.entity.Bowen;
import com.blog.service.BowenService;
import com.blog.service.IllegalKeywordsService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 覃玉初 on 2017/6/29.
 */
public class BowenServiceImpl  implements BowenService{

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

        boolean titleCorrect,contentCorrect;
        titleCorrect=illegalKeywordsService.keywordsJudgment(bowen.getBowentitle());
        contentCorrect=illegalKeywordsService.keywordsJudgment(bowen.getBowencontent());
        if(titleCorrect==true && contentCorrect==true){
            if(bowenMapper.insert(bowen)>0){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    /*
    * 删除博文
    * */
    public boolean bowenDelete(int bowenId){

        if(bowenMapper.deleteByPrimaryKey(bowenId)>0){
            return true;
        }else{
            return false;
        }
    }

    /*
    * 获取所有博文
    * */
    public List<Bowen> getAllBowen() {

        List<Bowen> bowenList=bowenMapper.selectAll();
        if(bowenList!=null){
            return bowenList;
        }else{
            return null;
        }
    }

    /*
    * 获取指定博文文章
    * */
    public Bowen getBowen(int bowenId) {
        Bowen bowen=bowenMapper.selectByPrimaryKey(bowenId);
        if(bowen!=null){
            return bowen;
        }else{
            return null;
        }
    }
}
