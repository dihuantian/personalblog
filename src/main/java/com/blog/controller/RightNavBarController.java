package com.blog.controller;

import com.blog.entity.Bowen;
import com.blog.entity.UserInfo;
import com.blog.service.BowenService;
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
public class RightNavBarController {

    @Resource
    private BowenService bowenService;

    @RequestMapping("/rightNavBar.jsp")
    public String getRightNavBar(ModelMap map){

        List<Bowen> allBowen=bowenService.getAllBowen();

        //存随机博文
        map.addAttribute("randomArray",bowenService.randomArray(allBowen));
        //最新博文
        map.addAttribute("netestBowen",bowenService.getRangeBowen(1));

        return "view/ViewComponent/JSP/BlogPages/rightNavBar";
    }


}
