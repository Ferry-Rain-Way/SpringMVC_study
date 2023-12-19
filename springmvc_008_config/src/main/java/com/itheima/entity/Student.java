package com.itheima.entity;

/**
 * @Version 1.0
 * @Date: 2023/11/19 22:36
 * @ClassName : Student
 * @Author : GUO_HONG_YU
 * @Description: TODO
 */
public class Student {
    private String name;
    private Integer age;
    private String addr;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                '}';
    }
}
