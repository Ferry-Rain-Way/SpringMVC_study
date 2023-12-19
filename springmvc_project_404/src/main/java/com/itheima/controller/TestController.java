package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Version 1.0
 * @Date: 2023/11/27 1:49
 * @ClassName : TestController
 * @Author : GUO_HONG_YU
 * @Description: TODO
 */

@Controller
public class TestController {
    @RequestMapping("/hello")
    public String test(){
        System.err.println("hello");
        return "{}";
    }
}
