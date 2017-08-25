package com.blog.controller;

import com.blog.entity.Bowen;
import com.blog.entity.UserInfo;
import com.blog.service.BowenService;
import com.blog.service.UserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * Created by 覃玉初 on 2017/7/29.
 */
@Controller
public class BlogController {

    @Resource
    private BowenService bowenService;

    @Resource
    private UserInfoService userInfoService;

    @RequestMapping(value = "/index/bowen")
    public String getSpecifyBowen(ModelMap map, @RequestParam("bowenId")int bowenId){

        Bowen bowen= bowenService.getBowen(bowenId);
        map.addAttribute("bowen",bowen);
        //获取网站博主信息
        map.addAttribute("bloggerInfo",getWebsiteBlogger());
        return "view/ViewComponent/JSP/BlogPages/news";
    }

    //获取网站博主主要信息
    public UserInfo getWebsiteBlogger(){

        return userInfoService.getUserInfo();
    }

}
