package com.blog.service;

import com.blog.customEntity.UserLoginInfo;
import com.blog.entity.UserInfo;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 覃玉初 on 2017/6/23.
 */
public interface UserLoginService {

    int userLogin(HttpServletRequest request,UserLoginInfo userLoginInfo);

}
