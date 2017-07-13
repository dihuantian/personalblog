package com.blog.serviceImpl;

import com.blog.dao.IllegalKeywordsMapper;
import com.blog.entity.IllegalKeywords;
import com.blog.service.IllegalKeywordsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 覃玉初 on 2017/6/29.
 */
@Service
public class IllegalKeywordsServiceImpl implements IllegalKeywordsService {

    @Resource
    private IllegalKeywordsMapper illegalKeywordsMapper;

    /*
    * 防止非法关键字
    * */
    public boolean keywordsJudgment(String leaveMessage){
        List<IllegalKeywords> illegalKeywordsList = illegalKeywordsMapper.selectAll();
        for(int i=0;i<illegalKeywordsList.size();i++){
            String keywords=illegalKeywordsList.get(i).getKeywords();
            if(leaveMessage.indexOf(keywords)>0){
                break;
            }else if(i==illegalKeywordsList.size()-1){
                return true;
            }
        }
        return false;
    }

}
