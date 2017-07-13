import com.blog.customEntity.UserRegisterInfo;
import com.blog.entity.UserInfo;
import com.blog.service.UserRegisterService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 覃玉初 on 2017/6/24.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class UserRegister {

    @Resource
    private UserRegisterService userRegisterService;

    @Resource
    private UserInfo userInfo;

    @Test
    public void RegisterTest(){

        userRegisterService.UserRegisterSave(userRegisterData());

    }

    public UserRegisterInfo userRegisterData(){
        Date date=new Date();
        UserRegisterInfo userRegisterInfo=new UserRegisterInfo();
        userRegisterInfo.setUserName("幻天");
        userRegisterInfo.setPassword("19950315");
        userRegisterInfo.setRegisterTime(date);
        userRegisterInfo.setUserLimit(true);
        userRegisterInfo.setUserAvatar("D:");
        return  userRegisterInfo;
    }

}
