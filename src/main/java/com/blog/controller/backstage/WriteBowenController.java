package com.blog.controller.backstage;

import com.blog.entity.Bowen;
import com.blog.entity.UserInfo;
import com.blog.service.BowenService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by 覃玉初 on 2017/8/7.
 */
@Controller
class WriteBowenController {

    private final static int blogger = 1;

    @Resource
    private BowenService bowenService;

    @RequestMapping(value = "/backstage/write", method = RequestMethod.GET)
    public String writeBowen(ModelMap map,HttpServletRequest request) {

        UserInfo userInfo= (UserInfo) request.getSession().getAttribute("userInfo");
        map.addAttribute("userInfo",userInfo);
        return "view/ViewComponent/JSP/BackstageManagement/WriteBowen";
    }

    @RequestMapping(value = "/backstage/writeBowen", method = RequestMethod.POST)
    @ResponseBody
    public String addBowen(HttpServletRequest request, Bowen bowen) {

        String json="{\"returnInfo\":0}";
        bowen.setUserid(blogger);
        bowen.setBowencategoryid(1);
        bowen.setBowenimag("null");
        if (bowenService.bowenSave(bowen)){

            json="{\"returnInfo\":1}";
            return json;
        }
        return json;
    }

}
