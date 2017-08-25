package com.blog.controller.backstage;

import com.blog.entity.UserInfo;
import com.blog.service.UserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * Created by 覃玉初 on 2017/8/2.
 */
@Controller
public class AdministratorInfoController {

    private final static int blogger = 1;

    @Resource
    private UserInfoService userInfoService;

    @RequestMapping(value = "/backstage/administratorInfo")
    public String getAdministratorInfo(ModelMap map) {

        UserInfo bloggerInfo = userInfoService.getUserInfo();
        map.addAttribute("bloggerInfo", bloggerInfo);
        return "view/ViewComponent/JSP/BackstageManagement/Backstage";
    }

    @RequestMapping(value = "/backstage/updateAdministratorInfo")
    @ResponseBody
    public String updateAdministratorInfo(UserInfo userInfo) {

        int flag = 0;
        String json = "{\"returnInfo\":" + flag + "}";
        userInfo.setUserid(blogger);
        if ((flag = userInfoService.updateUserInfo(userInfo)) > 0) {

            json = "{\"returnInfo\":" + flag + "}";
        }

        return json;
    }

    /*
    * 管理管理员头像
    * */
    @RequestMapping(value = "/backstage/updateAdministratorAvatar")
    @ResponseBody
    public String uploadAdministratorAvatar(ModelMap map, HttpServletRequest request, @RequestParam(value = "file") MultipartFile file) {

        String json="{\"returnInfo\":false}";
        boolean returnInfo = userInfoService.uploadAvatar(file,request, blogger);
        if (returnInfo==true){

            json="{\"returnInfo\":"+returnInfo+"}";
        }
        return json;
    }

    @RequestMapping(value = "/backstage/administratorAvatar")
    public String administratorAvatar(ModelMap map,HttpServletRequest request) throws IOException {

        map.addAttribute("userInfo",userInfoService.getUserInfo());
        return "view/ViewComponent/JSP/BackstageManagement/MyAvatar";
    }

}
