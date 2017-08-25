package com.blog.filterAuthority;

import com.blog.entity.UserInfo;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 覃玉初 on 2017/8/10.
 */
public class AuthorityInterception implements Filter {

    private FilterConfig filterConfig;

    public void init(FilterConfig filterConfig) throws ServletException {

        this.filterConfig = filterConfig;
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        int blogger = Integer.parseInt(filterConfig.getInitParameter("blogger"));
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        UserInfo userInfo = (UserInfo) request.getSession().getAttribute("userInfo");
        if (userInfo != null) {

            if ((userInfo.getUserid()) == blogger) {

                filterChain.doFilter(request, response);
            }
        }
        response.sendRedirect("/error/backgroundRequestError");
    }

    public void destroy() {

    }

}
