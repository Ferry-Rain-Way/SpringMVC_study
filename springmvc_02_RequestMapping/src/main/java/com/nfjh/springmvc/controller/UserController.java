package com.nfjh.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * @Auther: 34838
 * @Date: 2023/2/2 16:03
 * @Description:
 *  post、get 执行流程
 */
@Controller
@RequestMapping("/ghy")
public class UserController {
//    //此处的.action
    @RequestMapping("/hello.action")
    public String sayHello(){
        return "main";
    }

    @RequestMapping(value = "/test.action",method = RequestMethod.GET)
    public String doGetTest(){
        System.out.println("get 方法执行了!!!");
        return "main";
    }

    @RequestMapping(value = "/test.action",method = RequestMethod.POST)
    public String doPostTest(){
        System.out.println("post 方法执行了!!!");
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