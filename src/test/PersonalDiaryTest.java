import com.blog.service.PersonalDiaryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by 覃玉初 on 2017/6/28.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class PersonalDiaryTest {

    @Resource
    private PersonalDiaryService personalDiaryService;

    @Test
    public void personalDiaryTest(){
        System.out.println(personalDiaryService.getPersonalDiaryCount());
       /* System.out.println(personalDiaryService.getAllPersonalDiary(1).size());*/
    }

}
