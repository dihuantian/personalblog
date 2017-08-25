package com.blog.util;

import com.blog.customEntity.FileUploadStatusInfo;
import org.apache.commons.fileupload.ProgressListener;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;

/**
 * Created by 覃玉初 on 2017/8/4.
 */
public class FileUploadProgressListener implements ProgressListener {

    private HttpSession httpSession;

    public FileUploadProgressListener(HttpSession httpSession){

        super();
        this.httpSession=httpSession;
        FileUploadStatusInfo statusInfo=new FileUploadStatusInfo();
        httpSession.setAttribute("uploadStatusInfo",statusInfo);
    }

    public void update(long bytesRead, long contentLength, int items) {

        FileUploadStatusInfo statusInfo= (FileUploadStatusInfo) httpSession.getAttribute("uploadStatusInfo");
        statusInfo.setBytesRead(bytesRead);
        statusInfo.setContentLength(contentLength);
        statusInfo.setItems(items);
        statusInfo.setStartTime(System.currentTimeMillis());
        statusInfo.setUseTime(System.currentTimeMillis()-statusInfo.getStartTime());
        statusInfo.setPercent((int)(100*bytesRead/contentLength));
        httpSession.setAttribute("uploadStatusInfo",statusInfo);
    }

    public HttpSession getHttpSession() {
        return httpSession;
    }

    public void setHttpSession(HttpSession httpSession) {
        this.httpSession = httpSession;
    }
}
