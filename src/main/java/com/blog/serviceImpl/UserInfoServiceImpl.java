package com.blog.serviceImpl;

import com.blog.dao.UserInfoMapper;
import com.blog.entity.UserInfo;
import com.blog.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.Callable;

/**
 * Created by 覃玉初 on 2017/6/29.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    /*获取内置博主Id的信息*/
    public UserInfo getUserInfo() {
        return userInfoMapper.selectByPrimaryKey(1);
    }
}
