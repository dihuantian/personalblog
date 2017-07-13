package com.blog.controller;

import com.blog.customEntity.UploadFileInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * Created by 覃玉初 on 2017/6/27.
 */

@Controller
public class UploadFile {

    @Resource
    private UploadFileInfo uploadFileInfo;
    /*
    * 文件上传
    * */
    @RequestMapping(value = "uploadFile", method = RequestMethod.POST)
    public void upload(@RequestParam("uploadName")String uploadName, @RequestParam("file")MultipartFile file){

        if(!file.isEmpty()){

            String fileName=null;
            String fileType=null;
            byte[] bytes=null;
            try {
                uploadFileInfo.setFileName(file.getOriginalFilename());
                uploadFileInfo.setFileType(file.getContentType());
                uploadFileInfo.setBytes(file.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
