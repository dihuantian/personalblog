package com.blog.service;

import com.blog.entity.LeaveMessage;

import java.util.List;

/**
 * Created by 覃玉初 on 2017/6/25.
 */
public interface LeaveMessageService {

    /*将留言写进数据库*/
    boolean submitCommentSave(LeaveMessage leaveMessage);

    /*获取用户是否对留言评论*/
    int getUserComment(int leaveMessageId,int userId );

    /*获取所有的留言*/
    List<LeaveMessage> getLeaveMessage();


    /*更新留言评论*/
    boolean leaveMessageUpdate(int leaveMessageId,int userId ,int flag);

}
