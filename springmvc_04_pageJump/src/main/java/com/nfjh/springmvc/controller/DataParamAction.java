package com.nfjh.springmvc.controller;

import com.nfjh.springmvc.pojo.Student;
import org.springframework.stereotype.Controller;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @Auther: 34838
 * @Date: 2023/2/3 11:20
 * @Description:
 */
@Controller
public class DataParamAction {
    @RequestMapping("/data.action")
    public String forwardDataTest(
            HttpServletRequest request,
            HttpSession session,
            Model model,
            Map map,
            ModelMap modelMap){

        //待转发的数据
        Student stu = new Student("张三", 45);
        request.setAttribute("requestStu",stu);
        session.setAttribute("sessionStu",stu);
        model.addAttribute("modelStu",stu);
        map.put("map_stu",stu);
        modelMap.addAttribute("modelMapStu",stu);

        return "forward:/data/data.jsp";
    }
}
