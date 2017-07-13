package com.blog.serviceImpl;

import com.blog.customEntity.UserLoginInfo;
import com.blog.dao.UserInfoMapper;
import com.blog.entity.UserInfo;
import com.blog.publicenum.LoginReturnType;
import com.blog.service.UserLoginService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by 覃玉初 on 2017/6/23.
 */
@Service
@Transactional
public class UserLoginServiceImpl implements UserLoginService {

    private final int USER_NOT_EXIST=0;
    private final int USER_PASSWORD_ERROR=2;
    private final int USER_SUCCESS_LOGIN=1;

    @Resource
    private UserInfo userInfo;

    @Resource
    private UserInfoMapper userInfoMapper;

    /*
    * 根据用户的用户名和用户密码查询数据库
    * */
    public int userLogin(HttpServletRequest request, UserLoginInfo userLoginInfo) {

        userInfo=userInfoMapper.selectByUserName(userLoginInfo.getUserName());
        if(userInfo!=null){
            if((userInfo.getPassword()).equals(userLoginInfo.getPassword())){
                return USER_PASSWORD_ERROR;//返回USER_PASSWORD_ERROR表示用户密码错误
            }else{
                /*已经登录,驳回登录请求，提示用户*/
                request.getSession().setAttribute("userInfo",userInfo);
                return USER_SUCCESS_LOGIN;//返回USER_SUCCESS_LOGIN表示用户登录成功
            }
        }else{
            return USER_NOT_EXIST;//返回USER_NOT_EXIST表示用户不存在
        }
    }
}
