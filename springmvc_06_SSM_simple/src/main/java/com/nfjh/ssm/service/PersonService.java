package com.nfjh.ssm.service;


import com.nfjh.ssm.pojo.Person;


import java.util.List;

/**
 * @Auther: 34838
 * @Date: 2023/2/6 21:41
 * @Description:
 */
public interface PersonService {
    List<Person> selectAll();
}
