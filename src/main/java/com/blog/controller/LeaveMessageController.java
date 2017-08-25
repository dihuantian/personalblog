package com.blog.controller;

import com.blog.entity.LeaveMessage;
import com.blog.entity.UserInfo;
import com.blog.service.LeaveMessageService;
import com.blog.util.UtilChangeSqlDate;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by 覃玉初 on 2017/7/31.
 */
@Controller
public class LeaveMessageController {

    @Resource
    private LeaveMessageService leaveMessageService;

    @Resource
    private LeaveMessage leaveMessage;

    @Resource
    private UtilChangeSqlDate date;

    /**
     * 尝试使用ModelAndView传值到页面
     */
    @RequestMapping("/leaveMessage")
    public String getLaveMessage(ModelMap map) {

        //  ModelAndView viewValue=new ModelAndView();
        List<LeaveMessage> messageList = leaveMessageService.getLeaveMessage();
        // viewValue.addObject("messageList",messageList);
        map.addAttribute("messageList", messageList);
        return "view/ViewComponent/JSP/BlogPages/guestbook";
    }

    /*
    * 对点赞或贬低进行更改
    * */
    @RequestMapping(value = "/leaveMessage/commentId", method = RequestMethod.POST)
    @ResponseBody
    public String changeComment(HttpServletRequest request, int leaveMessageId, int flag) {

        String json = "{\"resultValue\": 0}";
        UserInfo userInfo = getUserInfo(request);
        if (userInfo != null) {

            int userId = userInfo.getUserid();
            boolean result = leaveMessageService.leaveMessageUpdate(leaveMessageId, userId, flag);
            if (flag == 1 && result) {

                json = "{\"resultValue\": 1}";
            } else if (flag == -1 && result) {

                json = "{\"resultValue\": -1}";
            }
        } else {

            return json;
        }
        return json;
    }

    /*
    * 发布留言并保存
    * */
    @RequestMapping(value = "/leaveMessage/addLeaveMessage", method = RequestMethod.POST)
    @ResponseBody
    public String saveLeaveMessage(HttpServletRequest request, String leaveMessageContent) {

        String json = "{\"error\":\"submitError\"}";
        UserInfo userInfo = getUserInfo(request);
        if (userInfo != null) {

            packageLeaveInfo(userInfo, leaveMessageContent);
            int keyValue = leaveMessageService.submitCommentSave(leaveMessage);
            if(keyValue!=0){

                Gson gson = new Gson();
                json = gson.toJson(leaveMessage);
                return json;
            }
        }
        return json;
    }


    /*
    * 获取是否存再登录用户
    * */
    private UserInfo getUserInfo(HttpServletRequest request) {

        UserInfo userInfo = (UserInfo) request.getSession().getAttribute("userInfo");
        return userInfo;
    }

    /*
    * 封装提交的留言信息
    * */
    private void packageLeaveInfo(UserInfo userInfo, String leaveMessageContent) {

        final int blogger=1;
        leaveMessage.setSendmessageuserid(1);
        leaveMessage.setSendmassageusername("玉初");
        leaveMessage.setReceiveuserid(blogger);
        leaveMessage.setLeaveamessagecontent(leaveMessageContent);
        leaveMessage.setProcrastination(0);
        leaveMessage.setLow(0);
        leaveMessage.setLeavemessagetime(date.getSqlDate());
    }

}
