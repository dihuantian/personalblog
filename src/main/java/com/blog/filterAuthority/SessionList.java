package com.blog.filterAuthority;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by 覃玉初 on 2017/6/24.
 */
public class SessionList implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest=(HttpServletRequest)servletRequest;
        /*根据HttpServletRequest请求获取全局变量*/
        ServletContext application= (ServletContext) httpServletRequest.getSession();
        /*根据全局变量获取存储的Session集合*/
        HashSet sessSet= (HashSet) application.getAttribute("sessions");
        /*遍历HashSet中的Session*/
        Iterator<HttpSession> iterator = sessSet.iterator();
        while(iterator.hasNext()){
            HttpSession session=iterator.next();
            /*查询所有Session中是否存在已经登录的此用户*/
            if(session.getAttribute("userInfo")!=null){
                HttpServletResponse httpServletResponse= (HttpServletResponse) servletResponse;
                httpServletResponse.sendRedirect("");
            }else{
                filterChain.doFilter(servletRequest,servletResponse);
            }
        }

    }

    public void destroy() {

    }
}
