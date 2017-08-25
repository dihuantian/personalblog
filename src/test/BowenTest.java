import com.blog.entity.Bowen;
import com.blog.service.BowenService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 覃玉初 on 2017/7/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class BowenTest {

    @Resource
    private BowenService bowenService;

    @Test
    public void bowenRangeTest(){

       List<Bowen> bowenList= bowenService.getRangeBowen(1);
        if (bowenList!=null)
            System.out.println("我是怕："+bowenList.get(0).getUserInfo().getUsername());
        else
            System.out.println("空的");
    }

}
