package com.nfjh.springmvc.controller;

import com.nfjh.springmvc.pojo.Person;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: 34838
 * @Date: 2023/2/3 16:19
 * @Description:
 */
@Controller
public class DateAction {
    //单个日期处理
    //简单日期格式刷:
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    @RequestMapping("/date.action")
    public String  testDateParam(
                    @DateTimeFormat(pattern = "yyyy-MM-dd")Date datePlaceholder1,
                    @DateTimeFormat(pattern = "yyyy-MM-dd")Date datePlaceholder2){

        //注意此处形参与表单name保持一致
        System.out.println("原始值:" + datePlaceholder1);
        System.out.println("SimpleDateFormat: "  + sdf.format(datePlaceholder1)); //注意此处形参与表单name保持一致
        System.out.println("原始值:" + datePlaceholder2);
        System.out.println("SimpleDateFormat: "  + sdf.format(datePlaceholder2));

        return "main";
    }


    //方法2:全局日期处理
    @InitBinder
    public void initBinderForDate(WebDataBinder webDataBinder){
        webDataBinder.registerCustomEditor(
                Date.class,new  CustomDateEditor(sdf,true)
        );
    }


    @RequestMapping("/date2.action")
    public String  testDateParams(Date datePlaceholder1,Date datePlaceholder2){
        //注意此处形参与表单name保持一致
        System.out.println("原始值:" + datePlaceholder1);
        System.out.println("SimpleDateFormat: "  + sdf.format(datePlaceholder1)); //注意此处形参与表单name保持一致
        System.out.println("原始值:" + datePlaceholder2);
        System.out.println("SimpleDateFormat: "  + sdf.format(datePlaceholder2));

        return "main";
    }

    //Date数据在前端转化并展示
    @RequestMapping("/date3.action")
    public String showDate(HttpServletRequest request) throws ParseException {
        Person jack = new Person("Jack", sdf.parse("2001-11-02"));
        request.setAttribute("person",jack);
        return "forward:/date/date.jsp";
    }
}
