package com.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 覃玉初 on 2017/8/10.
 */
@Controller
public class ErrorController {

    @RequestMapping(value = "/error/backgroundRequestError")
    public String backgroundRequestError(){

        return "view/ViewComponent/JSP/ErrorPage/BackgroundRequestError";
    }

}
