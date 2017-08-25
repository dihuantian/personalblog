package com.blog.serviceImpl;

import com.blog.dao.PersonalDiaryMapper;
import com.blog.entity.PersonalDiary;
import com.blog.service.PersonalDiaryService;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 覃玉初 on 2017/6/28.
 */
@Service
public class PersonalDiaryServiceImpl implements PersonalDiaryService {

    @Resource
    private PersonalDiaryMapper personalDiaryMapper;

    /*
    * 获取所有个人日记
    * */
    public List<PersonalDiary> getAllPersonalDiary() {

            List<PersonalDiary> personalDiaries=personalDiaryMapper.selectAll();
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
    public String personalDiarySave(PersonalDiary personalDiary) {

        String json="{\"returnInfo\":false}";

        if(personalDiaryMapper.insert(personalDiary)>0){

            Gson gson=new Gson();
            json=gson.toJson(personalDiary);
        }

        return json;
    }

    /*
    * 删除日记
    * */
    public String deleteDiary(int diaryId){

        String json="{\"returnInfo\":false}";
        if (personalDiaryMapper.deleteByPrimaryKey(diaryId)>0){

            json="{\"returnInfo\":true}";
        }

        return json;
    }

}
