package com.nfjh.springmvc.controller;

import com.nfjh.springmvc.pojo.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: 34838
 * @Date: 2023/2/2 17:01
 * @Description:
 *  研究数据的5中提交方式
 */
@Controller
public class DataController {

    @RequestMapping(value="/submit1.action")
    public String  getData(String student_name, int studentNo){//㊟:此处的形参名区分大小写,所以要和表单中的完全一致
        System.out.println(student_name + studentNo);
        return "main";
    }


    @RequestMapping(value="/submit2.action")
    public String  getDataByPojo(Student student){//此处的Student类并不在包扫描中,可正常运行
        System.out.println(student);
        return "main";
    }

    @RequestMapping(value = "/{name}/{no}/submit3.action")
    public String getDataByPlaceholder(
            //测试后发现 如果占位的字符串与形参不对应,会报500错误
            @PathVariable
                    String name,
            @PathVariable
                    int no){
        System.out.println(name + no);

        return "main";
    }

    @RequestMapping(value = "/submit4.action")
    public String getDataAndInconsistentMapping(
            @RequestParam("uname")
            String name,
            @RequestParam("uage")
            int age){
        System.out.println(name + age);
        return "main";
    }

    @RequestMapping(value = "/submit5.action")
    public String getDataByHttpServletRequest(HttpServletRequest request){
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        System.out.println(name + age);
        return "main";
    }


}
