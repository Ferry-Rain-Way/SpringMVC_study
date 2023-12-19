package com.nfjh.ssm.controller;

import com.nfjh.ssm.pojo.Person;
import com.nfjh.ssm.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auther: 34838
 * @Date: 2023/2/6 21:45
 * @Description:
 */
@Controller
public class PersonController {


    PersonService personService;
    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    @ResponseBody
    @RequestMapping("/person/selectAll")
    public List<Person> selectAll(){
        System.out.println(personService.selectAll());
        return personService.selectAll();
    }
/**
 * 使用jackson-databind 需要注意的点:
 *      如果发送请求,url正常的情况下,仍然404
 *      检查:是否为方法添加了 @RequestBody注解
 */
}
