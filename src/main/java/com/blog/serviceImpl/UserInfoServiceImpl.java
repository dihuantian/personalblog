package com.blog.serviceImpl;

import com.blog.dao.UserInfoMapper;
import com.blog.entity.UserInfo;
import com.blog.service.UserInfoService;
import com.blog.util.Interception;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
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

    public int updateUserInfo(UserInfo userInfo) {

        int rows = userInfoMapper.updateByPrimaryKey(userInfo);
        if (rows > 0)
            return rows;
        else
            return 0;
    }

    public String userInfoReverseInquire(HttpServletRequest request, int status) {

        String json = "{\"returnInfo\":null}";
        List<UserInfo> userInfoList = null;
        Gson gson = new Gson();
        ServletContext servletContext = request.getSession().getServletContext();
        userInfoList = judgmentUserQuantity((HashSet<HttpSession>) servletContext.getAttribute("sessions"));
        if (status != 0) {

            if (userInfoList.size() != 0) {

                json = gson.toJson(userInfoList);
            }
        } else {

            if (userInfoList.size() != 0) {

                userInfoList = userInfoMapper.selectReverseInquire(userInfoList);
            } else {

                userInfoList = userInfoMapper.selectAll();
            }
            json = gson.toJson(userInfoList);
        }

        System.out.println(json);
        return json;
    }

    public List<UserInfo> getOnlineUser(HttpServletRequest request) {

        HashSet<HttpSession> sessionSet = (HashSet) request.getSession().getServletContext().getAttribute("sessions");
        List<UserInfo> userInfoList = judgmentUserQuantity(sessionSet);
        return userInfoList;
    }

    public String deleteStatus(HttpServletRequest request, int userId) {

        String json = "{\"returnInfo\":false}";
        HashSet<HttpSession> sessionSet = (HashSet) request.getSession().getServletContext().getAttribute("sessions");
        Iterator<HttpSession> iterator = sessionSet.iterator();
        while (iterator.hasNext()) {

            HttpSession session = iterator.next();
            UserInfo userInfo = (UserInfo) session.getAttribute("userInfo");
            if (userInfo.getUserid() == userId) {

                iterator.remove();
                json = "{\"returnInfo\":false}";
                break;
            }
        }

        return json;
    }

    public boolean uploadAvatar(MultipartFile file, HttpServletRequest request, int blogger) {

        int onLine = 0;
        Interception interception=new Interception();
        String path = this.getClass().getClassLoader().getResource("/").getPath();

        if (file == null) {

            return false;
        } else {

            path = path.replace("WEB-INF/classes", "tempUpload/Images") + "blogger/";
            File file1 = new File(path);
            if (!file1.exists()) {

                file1.mkdirs();
            }
            try {

                File saveFile = new File(file1.getCanonicalPath() + "\\" + file.getOriginalFilename());
                file.transferTo(saveFile);
                UserInfo userInfo = (UserInfo) request.getSession().getAttribute("userInfo");
                userInfo.setUseravatar(interception.interceptionPath(saveFile.getPath(), "UploadFile"));
                onLine = userInfoMapper.updateByPrimaryKey(userInfo);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println(path);
        if (onLine > 0) {

            return true;
        }
        return false;
    }


    /*
  * 判断登录用户数量
  * */
    private List<UserInfo> judgmentUserQuantity(HashSet<HttpSession> sessionSet) {

        List<UserInfo> userInfoList = new ArrayList<UserInfo>();
        Iterator<HttpSession> iterator = sessionSet.iterator();
        while (iterator.hasNext()) {

            HttpSession session = iterator.next();
            UserInfo userInfo = (UserInfo) session.getAttribute("userInfo");
            if (userInfo != null) {

                userInfoList.add(userInfo);
            }
        }
        return userInfoList;
    }




}
