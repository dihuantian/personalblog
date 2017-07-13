package com.blog.serviceImpl;

import com.blog.dao.PersonalDiaryMapper;
import com.blog.entity.PersonalDiary;
import com.blog.service.PersonalDiaryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 覃玉初 on 2017/6/28.
 */
@Service
public class PersonalDiaryServiceImpl implements PersonalDiaryService {

    private final  int ROW=10;

    @Resource
    private PersonalDiaryMapper personalDiaryMapper;

    /*
    * 获取所有个人日记
    * */
    public List<PersonalDiary> getAllPersonalDiary(int page) {
            int start,end;
            start=(page-1)*ROW;
            end=((page-1)*ROW)+ROW;
            List<PersonalDiary> personalDiaries=personalDiaryMapper.selectAll(start,end);
            if(personalDiaries!=null){
                return personalDiaries;
            }else{
                return null;
            }
    }

    /*
    * 将个人日记写入到数据库中
    * */
    @Transactional
    public boolean personalDiarySave(PersonalDiary personalDiary) {

        if(personalDiaryMapper.insert(personalDiary)>0){
            return true;
        }else{
            return false;
        }
    }

    /*
    * 获取日记数据量
    * */

    public int getPersonalDiaryCount(){
        int pages=0;
        int diaryCount=personalDiaryMapper.selectAllCount();
        if(diaryCount > 0 && diaryCount <= 10){
            pages=1;
            return pages;
        }else{
            pages=diaryCount / ROW;
            if(diaryCount % ROW >= 1){
                pages+=1;
            }
            return pages;
        }
    }

}
