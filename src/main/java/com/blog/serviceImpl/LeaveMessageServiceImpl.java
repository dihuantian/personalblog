package com.blog.serviceImpl;

import com.blog.dao.IllegalKeywordsMapper;
import com.blog.dao.LeaveMessageCommentMapper;
import com.blog.dao.LeaveMessageMapper;
import com.blog.entity.IllegalKeywords;
import com.blog.entity.LeaveMessage;
import com.blog.entity.LeaveMessageComment;
import com.blog.service.IllegalKeywordsService;
import com.blog.service.LeaveMessageService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 覃玉初 on 2017/6/25.
 */

@Service
@Transactional
public class LeaveMessageServiceImpl implements LeaveMessageService {

    private final int COMMENT_EXIST=1;
    private final int COMMENT_NOT_EXIST=0;

    @Resource
    private LeaveMessageCommentMapper leaveMessageCommentMapper;
    @Resource
    private LeaveMessageMapper leaveMessageMapper;
    @Resource
    private IllegalKeywordsMapper illegalKeywordsMapper;

    @Resource
    private LeaveMessage leaveMessage;

    @Resource
    private LeaveMessageComment leaveMessageComment;

    @Resource
    private IllegalKeywordsService illegalKeywordsService;


    /*
    *
    * 下面所有方法均为读取留言准备,读取所有留言封装到一个list
    * */
    public List<LeaveMessage> getLeaveMessage(){

        List<LeaveMessage> leaveMessageList=leaveMessageMapper.selectAll();
        if(leaveMessageList!=null){
            return leaveMessageList;
        }
        return null;
    }

    /*
    *
    * 下面所有的方法均为保存留言而准备
    * */

    /*
    * 将留言写进数据库
    * */
    public boolean submitCommentSave(LeaveMessage leaveMessage){

        if(illegalKeywordsService.keywordsJudgment(leaveMessage.getLeaveamessagecontent())==true){
            leaveMessageMapper.insert(leaveMessage);
            return true;
        }
        return false;
    }

    /*
    *
    * 对留言评论进行更新
    * */

    public boolean leaveMessageUpdate(int leaveMessageId,int userId ,int flag){
        leaveMessage.setLeaveamessageid(leaveMessageId);
        if(flag==1){
            leaveMessage.setProcrastination(1);
        }else{
            leaveMessage.setLow(-1);
        }
        if(getUserComment(leaveMessageId,userId)>0){
            return false;
        }else{
            leaveMessageMapper.updateSelfAddByPrimaryKey(leaveMessage);
            return true;
        }
    }

    /*查看此用户是否已经评论了*/
    public int getUserComment(int leaveMessageId,int userId){
        if(leaveMessageCommentMapper.selectByUserId(leaveMessageId,userId)!=null){
            return COMMENT_EXIST;
        }else{
            leaveMessageComment.setLeaveamessageid(leaveMessageId);
            leaveMessageComment.setUserid(userId);
            leaveMessageCommentMapper.insert(leaveMessageComment);
            return COMMENT_NOT_EXIST;
        }
    }

}
