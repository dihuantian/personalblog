package com.blog.serviceImpl;

import com.blog.customEntity.UserRegisterInfo;
import com.blog.dao.UserInfoMapper;
import com.blog.entity.UserInfo;
import com.blog.service.UserRegisterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 覃玉初 on 2017/6/24.
 */
@Service
public class UserRegisterServiceImpl implements UserRegisterService {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Resource
    private UserInfo userInfo;

    /*
    * 判断用户再数据库中是否存在
    * */
    public boolean UserInquireExist(String userName) {

        if(userInfoMapper.selectByUserName(userName)!=null){
            return true;
        }else{
            return false;
        }
    }

    /*
    * 保存注册用户的数据
    * */
    public int UserRegisterSave(UserRegisterInfo userRegisterInfo) {

        boolean exist=UserInquireExist(userRegisterInfo.getUserName());
        if(exist==true){

        }else{
            savaRegisterEntity(userRegisterInfo);
            userInfoMapper.insert(userInfo);
        }

        return 0;
    }

    /*
    * 将用户提交的数据表单封装到实体模型中
    * */
    public void savaRegisterEntity(UserRegisterInfo userRegisterInfo) {
        userInfo.setUsername(userRegisterInfo.getUserName());
        userInfo.setPassword(userRegisterInfo.getPassword());
        userInfo.setUserlimit(userRegisterInfo.getUserLimit());
        userInfo.setUseravatar(userRegisterInfo.getUserAvatar());
        userInfo.setRegistertime(userRegisterInfo.getRegisterTime());
    }
}
