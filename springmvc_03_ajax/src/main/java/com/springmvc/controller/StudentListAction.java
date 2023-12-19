package com.springmvc.controller;

import com.springmvc.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: 34838
 * @Date: 2023/2/2 18:41
 * @Description:
 *      生成Student对象封装入List返回
 *      jackson-databind自动转化实体对象成JSON并响应给前端
 */
@Controller
public class StudentListAction {

    @ResponseBody
    @RequestMapping("/list.action")
    public List<Student> classToJson(){
        List<Student> list = new ArrayList<>();
        list.add(new Student("小郭",22));
        list.add(new Student("小张",21));
        list.add(new Student("小刘",22));
        return list;//jackson-databind自动转化实体对象成JSON并响应给前端
    }
}
