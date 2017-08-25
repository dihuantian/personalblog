import com.blog.entity.UserInfo;
import com.blog.service.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 覃玉初 on 2017/8/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class UserInfoInquire {

    List<UserInfo> userInfoList=new ArrayList<UserInfo>();

    @Resource
    public UserInfo userInfo;

    @Resource
    public UserInfoService userInfoService;

    @Test
    public void reverseInquireTest(){

        testEntity();
        userInfoList.add(userInfo);
    }

    private void testEntity(){

        userInfo.setUserid(1);
        userInfo.setUsername("覃玉初");
        userInfo.setPassword("123456");
        userInfo.setUserlimit(true);
        userInfo.setCareer("Java初级工程师");
        userInfo.setIntroduction("喜欢学习新技术，超级喜欢Java。");
        userInfo.setUseravatar("c:");
        userInfo.setRegistertime(null);
    }

}
