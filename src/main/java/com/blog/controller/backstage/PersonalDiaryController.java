package com.blog.controller.backstage;

import com.blog.entity.PersonalDiary;
import com.blog.service.PersonalDiaryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 覃玉初 on 2017/8/8.
 */
@Controller
public class PersonalDiaryController {

    private final static int blogger=1;

    @Resource
    private PersonalDiaryService personalDiaryService;

    @RequestMapping(value = "/backstage/personalDiary")
    public String getAllPersonalDiary(ModelMap map){

        List<PersonalDiary> personalDiaryList=personalDiaryService.getAllPersonalDiary();
        map.addAttribute("personalDiaryList",personalDiaryList);
        return "view/ViewComponent/JSP/BackstageManagement/PersonalDiary";
    }

    @RequestMapping(value = "/backstage/personalDiary/add")
    @ResponseBody
    public String addPersonalDiary(PersonalDiary personalDiary){

        personalDiary.setUserid(blogger);
        return personalDiaryService.personalDiarySave(personalDiary);
    }

    @RequestMapping(value = "/backstage/personalDiary/delete")
    @ResponseBody
    public String deletePersonalDiary(int diaryid){

        return personalDiaryService.deleteDiary(diaryid);
    }
}
