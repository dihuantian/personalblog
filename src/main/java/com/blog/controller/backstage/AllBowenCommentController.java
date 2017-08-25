package com.blog.controller.backstage;

import com.blog.entity.BowenAppreciation;
import com.blog.service.BowenAppreciationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 覃玉初 on 2017/8/2.
 */
@Controller
public class AllBowenCommentController {

    @Resource
    private BowenAppreciationService bowenAppreciationService;

    @RequestMapping(value = "/backstage/bowenComment")
    public String getAllBowenComment(ModelMap map, @RequestParam(value = "page", defaultValue = "1") int page) {

        List<BowenAppreciation> appreciationList = bowenAppreciationService.getRangeBowenComment(page);
        map.addAttribute("appreciationList", appreciationList);
        return "view/ViewComponent/JSP/BackstageManagement/BobenComment";
    }

    @RequestMapping(value = "/backstage/deleteComment")
    @ResponseBody
    public String deleteBowenComment(int commentId) {

        String json = "{\"returnInfo\":0}";
        int rows = bowenAppreciationService.deleteSpecifyBowenComment(commentId);
        if (rows > 0) {

            json = "{\"returnInfo\":1}";
        }
        return json;
    }

}
