package com.nfjh.ssm.service.impl;

import com.nfjh.ssm.mapper.PersonMapper;
import com.nfjh.ssm.pojo.Person;
import com.nfjh.ssm.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: 34838
 * @Date: 2023/2/6 21:43
 * @Description:
 */
@Service
public class PersonServiceImpl implements PersonService {

    private PersonMapper personMapper;
    @Autowired
    public PersonServiceImpl(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }

    //查询
    public List<Person> selectAll(){
        return personMapper.selectAll();
    }
}
