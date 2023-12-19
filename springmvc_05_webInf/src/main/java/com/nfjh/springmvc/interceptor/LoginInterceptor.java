package com.nfjh.springmvc.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @Auther: 34838
 * @Date: 2023/2/4 17:40
 * @Description:
 */
public class LoginInterceptor  implements HandlerInterceptor {
    //拦截器预处理
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        //取出Session中的用户数据进行判断
        HttpSession session = request.getSession();
        Object name = session.getAttribute("name");
        if (name==null){
            request.setAttribute("mgs","用户未登录,请登录!!");
            request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
        }

        return true;
    }
}
