package com.blog.customEntity;

/**
 * Created by 覃玉初 on 2017/8/4.
 */
public class FileUploadStatusInfo {

    private long bytesRead;//已经读取文件内容

    private long contentLength;//内容长度

    private long items;//读取的第几个文件

    private long startTime=System.currentTimeMillis();//开始时间

    private long useTime=System.currentTimeMillis();//已使用时间

    private int percent;//文件上传百分比

    public long getBytesRead() {
        return bytesRead;
    }

    public void setBytesRead(long bytesRead) {
        this.bytesRead = bytesRead;
    }

    public long getContentLength() {
        return contentLength;
    }

    public void setContentLength(long contentLength) {
        this.contentLength = contentLength;
    }

    public long getItems() {
        return items;
    }

    public void setItems(long items) {
        this.items = items;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getUseTime() {
        return useTime;
    }

    public void setUseTime(long useTime) {
        this.useTime = useTime;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    @Override
    public String toString() {
        return "FileUploadStatusInfo{" + "items=" + items + ", percent=" + percent + '}';
    }
}
