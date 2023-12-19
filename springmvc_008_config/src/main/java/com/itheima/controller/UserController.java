package com.itheima.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;


/**
 * @Version 1.0
 * @Date: 2023/11/14 0:28
 * @ClassName : UserController
 * @Author : GUO_HONG_YU
 * @Description: TODO
 */
@RestController
public class UserController {

    @RequestMapping("/encode/编码")
    public String encodeConfigCheck(HttpServletRequest request) throws UnsupportedEncodingException {
        System.out.println("=====================================");
        request.setCharacterEncoding("UTF-8");
        System.out.println("url:" + request.getRequestURL().toString());
        System.out.println("uri:" + request.getRequestURI());
        System.out.println("param:" + request.getParameter("name"));
        System.out.println("queryString:" + request.getQueryString());
        System.out.println("file.encoding:" + System.getProperty("file.encoding"));

        System.out.println("=====================================");

        return "{}";
    }


}
