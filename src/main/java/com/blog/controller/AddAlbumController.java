package com.blog.controller;

import com.blog.entity.Image;
import com.blog.entity.UserAlbum;
import com.blog.entity.UserInfo;
import com.blog.service.AlbumManagementService;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by 覃玉初 on 2017/7/29.
 */

@Controller
public class AddAlbumController {

    //相册图片限制
    private final int albumQuantityLimit = 100;
    //默认博主
    private final int bloggerLimit = 1;
    //默认创建创建路径
    private String path = "";

    @Resource
    private AlbumManagementService albumManagementService;

    @RequestMapping(value = "/albumSet")
    public String getAllAlbum(HttpServletRequest request, ModelMap map) {

        boolean bloggerExist = false;
        //暂时使用
        UserInfo info = (UserInfo) request.getSession().getAttribute("userInfo");
        if (info != null) {
            if (info.getUserlimit())
                bloggerExist = true;
        }
        List<UserAlbum> userAlbumList = albumManagementService.getAllAlbum();
        map.addAttribute("userAlbumList", userAlbumList);
        map.addAttribute("bloggerExist", bloggerExist);
        return "view/ViewComponent/JSP/BlogPages/xc";
    }

    @RequestMapping(value = "/albumSet/add", method = RequestMethod.POST)
    @ResponseBody
    public String addAlbum(HttpServletRequest request, UserAlbum userAlbum) {

        String json = "{'error':'create error'}";
        //获取编译后的相册路径
        path = this.getClass().getClassLoader().getResource("/").getPath();
        //截取路径到WEB-INF
        path = path.replace("WEB-INF/classes", "tempUpload/Images");
        //UserInfo userInfo= (UserInfo) request.getSession().getAttribute("userInfo");
        packageData(userAlbum);
        boolean success = albumManagementService.createAlbum(userAlbum, path);
        if (success) {

            Gson gson = new Gson();
            json = gson.toJson(userAlbum);
            return json;
        } else {

            return json;
        }
    }

    /*
    *
    * 获取指定相册ID的图片内容
    * */
    @RequestMapping(value = "/albumSet/album/albumName")
    public String getAlbumContent(ModelMap map, @RequestParam("albumId") int albumId) {

        List<Image> imageList = albumManagementService.getAllImage(albumId);
        map.addAttribute("imageList", imageList);

        return "view/ViewComponent/JSP/BlogPages/ceshi";
    }

    //默认封装album数据
    private void packageData(UserAlbum userAlbum) {
        userAlbum.setUserid(bloggerLimit);
        userAlbum.setAblumcapacity(albumQuantityLimit);
    }
}
