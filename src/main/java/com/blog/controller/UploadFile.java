package com.blog.controller;

import com.blog.customEntity.FileUploadStatusInfo;
import com.blog.customEntity.UploadFileInfo;
import com.blog.entity.UserAlbum;
import com.blog.service.AlbumManagementService;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by 覃玉初 on 2017/6/27.
 */

@Controller
public class UploadFile {

    @Resource
    private UploadFileInfo uploadFileInfo;

    @Resource
    private AlbumManagementService albumManagementService;

    @RequestMapping(value = "/backstage/singleUploadFile", method = RequestMethod.POST)
    public void singleUploadFile(@RequestParam("file") MultipartFile file) {

        if (!file.isEmpty()) {

            String fileName = null;
            String fileType = null;
            byte[] bytes = null;
            try {
                uploadFileInfo.setFileName(file.getOriginalFilename());
                uploadFileInfo.setFileType(file.getContentType());
                uploadFileInfo.setBytes(file.getBytes());
                File saveFile = new File("d:/" + uploadFileInfo.getFileName());
                if (!saveFile.exists()) {

                    saveFile.mkdir();
                }
                file.transferTo(saveFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @RequestMapping(value = "/backstage/manyUploadFile", method = RequestMethod.POST)
    public String manyUploadFile(@RequestParam(value = "files", required = false) MultipartFile[] files,@RequestParam(value = "albumName", required = true)String albumName) {

        albumManagementService.uploadImage(files,albumName);
        return "success";
    }

    @RequestMapping(value = "/backstage/uploadFilePage", method = RequestMethod.GET)
    public String getUploadFilePage(ModelMap map) {

        List<UserAlbum> userAlbumList = albumManagementService.getAllAlbum();
        map.addAttribute("userAlbumList",userAlbumList);
        return "view/ViewComponent/JSP/BackstageManagement/UploadFile";
    }

    /*
    * 获取上传文件的上传进度状态
    * */
    @RequestMapping(value = "/backstage/uploadStatus",method = RequestMethod.GET)
    @ResponseBody
    public String getUploadStatus(HttpSession httpSession) {

        FileUploadStatusInfo statusInfo=(FileUploadStatusInfo) httpSession.getAttribute("uploadStatusInfo");
        if (statusInfo!=null){

            Gson gson=new Gson();
            return gson.toJson(statusInfo);
        } else{

            return "{\"returnInfo\"uploadEnd}";
        }
    }

}
