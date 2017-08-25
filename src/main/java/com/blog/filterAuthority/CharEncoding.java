package com.blog.filterAuthority;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Created by 覃玉初 on 2017/7/19.
 */
public class CharEncoding implements Filter {

    private FilterConfig Config;

    public void init(FilterConfig filterConfig) throws ServletException {
        this.Config=filterConfig;
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain){
        String characterSet=this.Config.getInitParameter("characterSet");
        HttpServletRequest request= (HttpServletRequest) servletRequest;
        HttpServletResponse response= (HttpServletResponse) servletResponse;
        try {
            request.setCharacterEncoding(characterSet);
            response.setCharacterEncoding(characterSet);
            filterChain.doFilter(request,response);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void destroy() {

    }
}
