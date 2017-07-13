package com.blog.customEntity;

import org.springframework.stereotype.Repository;

/**
 * Created by 覃玉初 on 2017/6/27.
 */

@Repository
public class UploadFileInfo {

    private String fileName;
    private String fileType;
    private byte[] bytes;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }
}
