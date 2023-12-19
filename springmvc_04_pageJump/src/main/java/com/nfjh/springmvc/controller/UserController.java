package com.nfjh.springmvc.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
@RequestMapping("/ghy")
public class UserController {

    //默认是请求转发
    @RequestMapping("/hello.action")
    public String sayHello(){
        return "main";
    }


    @RequestMapping("/forward/test.action")
    public String requestForwarding(){
        System.out.println("forward:转发开始");
//        return "forward:/admin/main.jsp"
        return "forward:/ghy/other.action";//注意此处的/ghy是路径的一部分,不是项目名
//        return "forward:/temp/test.jsp";
    }



    @RequestMapping("/redirect/test.action")
    public String redirectAccept(){
        System.out.println("redirect:重定向开始");
        return "redirect:/admin/main.jsp";
//        return "redirect:/temp/test.jsp";
    }

/*
在使用springmvc提供的转发时,会通过springmvc-config.xml中的前缀后缀进行拼接路径
也就是说会提供一个已存在的文件夹admin ,再次文件夹下的跳转时不需要写文件夹名称的
于是就产生了一个新的问题:若存在另一个文件夹temp
需要向该文件夹下跳转页面时该怎么操作呢?
答:直接加上文件夹名称就可以了
forward:/ghy/temp/test.jsp
redirect:/temp/test.jsp
 */

    //HttpServletRequest request, HttpServletResponse response
    @RequestMapping("/forward/HttpServlet.action")
    public void forwardByHttpServletRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("HttpServlet转发开始");
        request.getRequestDispatcher("/ghy/hello.action").forward(request,response);
    }


    @RequestMapping("/redirect/HttpServlet.action")
    public void redirectHttpServlet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            System.out.println("HttpServlet重定向开始");
            response.sendRedirect(request.getContextPath() + "/admin/main.jsp");
            //在使用HttpServletResponse 进行页面的重定向时需要加上项目名
    }





    //以上的转发将会被下面的action接收
    @RequestMapping("/other.action")
    public String forwardAccept(){
        System.out.println("other.action 转发成功");
        return "main";
    }
}
/**
 * return "/other.action";
 * 以上写法是错误的
 * 为什么? 以上完整的写法为 /admin/ /other.action .jsp

 * 在springmvc-config.xml 文件的InternalResourceViewResolver类头为下
 * public class InternalResourceViewResolver extends UrlBasedViewResolver {
 * 在继续查看 UrlBasedViewResolver 可以发现该类中存在以下两个属性
 *
 *     public static final String REDIRECT_URL_PREFIX = "redirect:";
 *     public static final String FORWARD_URL_PREFIX = "forward:";
 *
 * 当使用到 "redirect:"和 "forward:" 时将不会进行前后缀的拼接
 *
 * 所以以上的正确写法为
 *  return "forward:/other.action"
 *
 * redirect: 和 forward: 后面都是以webapp为起始点,最前面加'/' 开始
 * 不不需要加上项目名
 *
 */


/*
总结:
    springmvc-config.xml文件中 前缀 /admin/  后缀 .jsp
    0、不使用forward: & redirect: 时,返回值自动拼接前后缀
    1、forward: & redirect: 都是以webapp为起始点,最前面加'/' 开始
    2、使用 forward: & redirect: 跳转文件夹前后缀无用,都需要加上文件夹名,admin文件夹也要加
    3、使用HttpServletResponse 进行重定向需要加上项目名
 */