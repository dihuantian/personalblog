import com.blog.entity.LeaveMessage;
import com.blog.service.LeaveMessageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by 覃玉初 on 2017/6/25.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class LeaveMessageTest {

    @Resource
    public LeaveMessageService leaveMessageService;

    @Test
    public void  LeaveMessageTest(){

        leaveMessageService.leaveMessageUpdate(5,2,-1);

    }

    public LeaveMessage userLeaveMessage(){
        LeaveMessage leaveMessage=new LeaveMessage();
        leaveMessage.setSendmessageuserid(1);
        leaveMessage.setSendmassageusername("覃玉初");
        leaveMessage.setReceiveuserid(2);
        leaveMessage.setLow(0);
        leaveMessage.setProcrastination(0);
        leaveMessage.setLeaveamessagecontent("感觉上说还是不错的强奸");

        java.util.Date utilDate=new java.util.Date();
        java.sql.Date sqlDate=new java.sql.Date(utilDate.getTime());
        java.sql.Timestamp stp=new java.sql.Timestamp(utilDate.getTime());

        leaveMessage.setLeavemessagetime(stp);

        return  leaveMessage;
    }

}
