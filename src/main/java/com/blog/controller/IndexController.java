package com.blog.controller;

import com.blog.entity.UserInfo;
import com.blog.service.UserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by 覃玉初 on 2017/6/29.
 */
@Controller
public class IndexController {

    @Resource
    private UserInfoService userInfoService;

    @RequestMapping(value = "/index")
    public String index(ModelMap map){
        UserInfo userInfo= userInfoService.getUserInfo();
        map.addAttribute("userInfo",userInfo);
        return "../index";
    }

    @RequestMapping(value = "/Login")
    public String login(){

        return "view/LoginAndRegister/Login";
    }

}
