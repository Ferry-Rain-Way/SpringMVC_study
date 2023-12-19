package com.nfjh.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ghy")
public class UserController {
    //此处的.action
    @RequestMapping("/hello.action")
    public String sayHello(){
        return "main";
    }
}

/**
 * @RequestMapping
 * 作用:为sayHello方法提供访问的路径
 *
 * ㊟:当@RequestMapping加在类上
 *  提供一个虚拟路径,用以区分不同包中的相同action,该路径在方法路径的前面
 *  比如此处的路径为
 *  ${pageContext.request.contextPath}/ghy/hello.action
 */