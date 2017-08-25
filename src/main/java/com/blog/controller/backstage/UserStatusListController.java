package com.blog.controller.backstage;

import com.blog.entity.UserInfo;
import com.blog.service.UserInfoService;
import com.google.gson.Gson;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * Created by 覃玉初 on 2017/8/3.
 */
@Controller
public class UserStatusListController {

    @Resource
    private UserInfoService userInfoService;

    /*
    * 单纯获取默认开启这个页面的内容数据
    * */
    @RequestMapping(value = "/backstage/userStatus")
    public String getAllUserStatusList(HttpServletRequest request, ModelMap map) {

        List<UserInfo> userInfoList = userInfoService.getOnlineUser(request);
        map.addAttribute("userInfoList", userInfoList);
        return "view/ViewComponent/JSP/BackstageManagement/UserList";
    }

    /*
    * 改变状态变化方法
    * */
    @RequestMapping(value = "/backstage/userStatusChange", method = RequestMethod.POST)
    @ResponseBody
    public String getStatusChangeUserInfo(HttpServletRequest request, @RequestParam(value = "status", defaultValue = "1") int status) {

        return userInfoService.userInfoReverseInquire(request, status);
    }

    /*
    * 踢人方法
    * */
    @RequestMapping(value = "/backstage/deleteUserStatus", method = RequestMethod.POST)
    @ResponseBody
    public String deleteUserInfoStatus(HttpServletRequest request, @RequestParam(value = "userId", defaultValue = "0") int status) {

        return userInfoService.deleteStatus(request, status);
    }

}
