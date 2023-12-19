package com.nfjh.ssm.mapper;

import com.nfjh.ssm.pojo.Person;

import java.util.List;

/**
 * @Auther: 34838
 * @Date: 2023/2/6 21:25
 * @Description:
 */
public interface PersonMapper {
    /**
     * 查询所有人的信息(姓名、年龄)
     * @return
     */
    List<Person> selectAll();
}
