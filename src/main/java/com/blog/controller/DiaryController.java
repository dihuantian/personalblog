package com.blog.controller;

import com.blog.entity.Bowen;
import com.blog.entity.PersonalDiary;
import com.blog.entity.UserInfo;
import com.blog.service.BowenService;
import com.blog.service.PersonalDiaryService;
import com.blog.service.UserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 覃玉初 on 2017/7/29.
 */
@Controller
public class DiaryController {

    private int defaultPage=1;

    @Resource
    private PersonalDiaryService personalDiaryService;

    @Resource
    private BowenService bowenService;

    @Resource
    private UserInfoService userInfoService;

    @RequestMapping(value = "/diary")
    public String getAllPersonalDiary(ModelMap map){

        List<Bowen> allBowen=bowenService.getAllBowen();

        List<PersonalDiary> diaryList=personalDiaryService.getAllPersonalDiary();
        //获取网站博主信息
        map.addAttribute("bloggerInfo",getWebsiteBlogger());
        //存随机博文
        map.addAttribute("randomArray",bowenService.randomArray(allBowen));
        //最新博文
        map.addAttribute("netestBowen",bowenService.getRangeBowen(1));
        //获取所有日记列表
        map.addAttribute("diaryList",diaryList);
        return "view/ViewComponent/JSP/BlogPages/riji";
    }

    //获取网站博主主要信息
    public UserInfo getWebsiteBlogger(){

        return userInfoService.getUserInfo();
    }

}
