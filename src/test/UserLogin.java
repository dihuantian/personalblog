import com.blog.entity.UserInfo;
import com.blog.service.UserLoginService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by 覃玉初 on 2017/6/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class UserLogin {

    @Resource
    private UserLoginService userLogin;

    @Resource
    private UserInfo userInfo;

    @Test
    public void getUserLogin(){

    }

}
