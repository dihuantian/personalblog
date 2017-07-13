import com.blog.entity.UserAlbum;
import com.blog.service.AlbumManagementService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by 覃玉初 on 2017/6/27.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class AlbumTest {

    @Resource
    private AlbumManagementService albumManagementService;

    @Test
    public void albumCreate(){
/*        String classpath = System.getProperty("user.dir");
        albumManagementService.createAlbum(packageAlbumData(),classpath);*/
        /*System.out.println(albumManagementService.getAllAlbum().get(0).getAlbumname());*/
  /*      albumManagementService.alterAlbum(1,"zhangyuanzhi");*/
        albumManagementService.getAllImage(1);
    }

    private UserAlbum packageAlbumData(){
        UserAlbum userAlbum=new UserAlbum();
        userAlbum.setUserid(1);
        userAlbum.setAlbumname("qinyuchu");
        userAlbum.setAblumcapacity(150);
        return userAlbum;
    }

}
