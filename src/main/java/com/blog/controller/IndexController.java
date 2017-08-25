package com.blog.controller;

import com.blog.entity.Bowen;
import com.blog.entity.UserInfo;
import com.blog.service.BowenService;
import com.blog.service.UserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 覃玉初 on 2017/6/29.
 */
@Controller
public class IndexController {

   // private final int pages=1;
    private final int limit = 5;
    private int startPages = 1;

    @Resource
    private BowenService bowenService;

    @Resource
    private UserInfoService userInfoService;

    @RequestMapping(value = "/index")
    public String index(ModelMap map, @RequestParam(value = "page", defaultValue = "1") int pages) {

        indexContent(map, pages);
        return "view/ViewComponent/JSP/BlogPages/learn";
    }

    /*@RequestMapping(value = "/index/pages")
    public  String index(ModelMap map,@RequestParam(value = "page",defaultValue = "1") int current){

        System.out.println("进来了");
        indexContent(map,current);
        return "view/ViewComponent/JSP/BlogPages/learn";
    }*/


    private void indexContent(ModelMap map, int current) {
        int bowenQuantity = 0;
        List<Bowen> bowenList = null;
        bowenList = bowenService.getRangeBowen(current);
/*        if(current>1 ){
            bowenList=bowenService.getRangeBowen(current);
        }else{
            bowenList=bowenService.getRangeBowen(this.pages);
        }*/
        bowenQuantity = bowenService.getBowenQuantity();
        List<Bowen> allBowen = bowenService.getAllBowen();
        //计算博文开始页数和总显示页数
        if (processPaging(bowenQuantity, current) == 0) {

            startPages = 1;
            map.addAttribute("startPage", startPages);
            map.addAttribute("current", current);
        } else {

            map.addAttribute("startPage", current);
            map.addAttribute("current", current);
        }
        //获取网站博主信息
        map.addAttribute("bloggerInfo", getWebsiteBlogger());
        //存随机博文
        map.addAttribute("randomArray", bowenService.randomArray(allBowen));
        //最新博文
        map.addAttribute("netestBowen", bowenService.getRangeBowen(1));
        //所有博文总数
        map.addAttribute("bowenQuantity", bowenQuantity);
        //所有博文列表
        map.addAttribute("bowenList", bowenList);
    }

    @RequestMapping(value = "/login")
    public String login() {

        return "view/LoginAndRegister/Login";
    }

    //对分页进行限制
    private int processPaging(int paging, int current) {

        if (paging / limit == 0) {

            return 0;
        }

        return current;
    }

    //获取网站博主主要信息
    public UserInfo getWebsiteBlogger() {

        return userInfoService.getUserInfo();
    }

}