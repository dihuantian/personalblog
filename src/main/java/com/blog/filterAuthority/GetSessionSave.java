package com.blog.filterAuthority;

import javax.servlet.*;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.io.IOException;
import java.util.HashSet;

/**
 * Created by 覃玉初 on 2017/6/24.
 */

/*会话Session列表*/
public class GetSessionSave implements HttpSessionListener {


    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        HttpSession session = httpSessionEvent.getSession();
        ServletContext application = session.getServletContext();
        // 在application范围由一个HashSet集保存所有的session
        HashSet<HttpSession> sessSet = (HashSet) application.getAttribute("sessions");
        if (sessSet == null) {
            sessSet = new HashSet();
            application.setAttribute("sessions", sessSet);
        }
        // 新创建的session均添加到HashSet集中
        sessSet.add(session);
    }

    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        HttpSession session = httpSessionEvent.getSession();
        ServletContext application = session.getServletContext();
        HashSet sessions = (HashSet) application.getAttribute("sessions");

        // 销毁的session均从HashSet集中移除
        sessions.remove(session);
    }
}
