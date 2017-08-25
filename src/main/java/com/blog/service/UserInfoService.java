package com.blog.service;

import com.blog.entity.UserInfo;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by 覃玉初 on 2017/6/29.
 */
public interface UserInfoService {

    UserInfo getUserInfo();

    int updateUserInfo(UserInfo userInfo);

    String userInfoReverseInquire(HttpServletRequest request,int status);

    List<UserInfo> getOnlineUser(HttpServletRequest request);

    String deleteStatus(HttpServletRequest request,int userId);

    boolean uploadAvatar(MultipartFile file,HttpServletRequest request,int blogger);

}
