package com.blog.service;

import com.blog.entity.PersonalDiary;

import java.util.List;

/**
 * Created by 覃玉初 on 2017/6/28.
 */
public interface PersonalDiaryService {

    List<PersonalDiary> getAllPersonalDiary(int page);

    boolean personalDiarySave(PersonalDiary personalDiary);

    int getPersonalDiaryCount();
}
