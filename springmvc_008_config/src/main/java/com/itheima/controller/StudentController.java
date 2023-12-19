package com.itheima.controller;

import com.itheima.entity.Student;
import org.springframework.web.bind.annotation.*;

/**
 * @Version 1.0
 * @Date: 2023/11/19 22:33
 * @ClassName : StudentController
 * @Author : GUO_HONG_YU
 * @Description: 接收RESTful风格请求数据
 */
@RestController
@CrossOrigin
@RequestMapping("/student")
public class StudentController {

    @RequestMapping(value = "/{id}" ,method = RequestMethod.PUT)
    public String delete(@PathVariable String id, Student student){
        System.out.println("PUT:id"+ id);
        System.out.println("PUT:student"+ student);
        return "{}";
    }

}
