package com.blog.controller;

import com.blog.customEntity.UserLoginInfo;
import com.blog.customEntity.UserRegisterInfo;
import com.blog.service.UserLoginService;
import com.blog.service.UserRegisterService;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by 覃玉初 on 2017/7/19.
 */
@Controller
public class UserLoginController {

    @Resource
    private UserLoginService userLoginService;

    @Resource
    private UserRegisterService registerService;

    @RequestMapping(value = "/loginUser", method = RequestMethod.GET)
    @ResponseBody
    public String userLogin(HttpServletRequest request, UserLoginInfo userLoginInfo, ModelMap map) {
        Gson gson = new Gson();
        String json = "{\"returnInfo\":0}";
        if (userLoginService.userLogin(request, userLoginInfo) == 1) {

            json = "{\"returnInfo\":1}";
            return gson.toJson(userLoginInfo);
        } else {

            return json;
        }

    }

    @RequestMapping(value = "/register")
    public String userRegisterPage() {

        return "view/LoginAndRegister/Register";
    }

    @RequestMapping(value = "/register/registerUser")
    public String userRegister(UserRegisterInfo registerInfo) {

        if (registerService.UserRegisterSave(registerInfo) > 0){

            return "view/LoginAndRegister/Login";
        }
        return "view/LoginAndRegister/Register";
    }

    @RequestMapping(value = "/User")
    public String UserComment() {

        return "view/ViewComponent/JSP/BlogPages/learn";
    }
}
