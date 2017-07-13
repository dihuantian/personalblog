package com.blog.service;

import com.blog.customEntity.UserRegisterInfo;

/**
 * Created by 覃玉初 on 2017/6/24.
 */
public interface UserRegisterService {

    /*查询注册用户是否存在*/
    boolean UserInquireExist(String userName);
    /*保存注册用户*/
    int UserRegisterSave(UserRegisterInfo userRegisterInfo);

    /*将注册信息保存到注册实体中*/
    void savaRegisterEntity(UserRegisterInfo userRegisterInfo);

}
