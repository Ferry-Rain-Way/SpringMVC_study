package com.nfjh.springmvc.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: 34838
 * @Date: 2023/2/4 16:45
 * @Description:
 */
@Controller
public class LoginController {
    //从loginAction进入登录界面login.jsp
    @RequestMapping("/loginAction")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/loginCheck")
    public String loginCheck(String name, String passwd, HttpServletRequest request){
        //假设 name: hello
        // passwd : world
        if (name!=null&&passwd!=null&&
            name.equals("hello")&&passwd.equals("world")){
            //成功跳转hello.jsp
            //1、拦截器实现-存储数据到session
            request.getSession().setAttribute("name",name);
            return "hello";
        }else{
            //验证失败回到/loginAction
            request.setAttribute("mgs","用户名或密码不正确!");
            return "login";
        }
    }

    @RequestMapping("/other")
    public String otherPage(){
        return "other";
    }
}
