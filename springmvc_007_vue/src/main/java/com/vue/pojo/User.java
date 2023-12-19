package com.vue.pojo;

import java.io.Serializable;
import java.util.StringJoiner;

/**
 * @Auther: 34838
 * @Date: 2023/3/22 00:18
 * @Description:
 */
public class User implements Serializable {
    private String id;
    private String name;
    private String addr;
    private int age;
    private int sex;
    private String birth;

    public User() {
    }

    public User(String id, String name, String addr, int age, int sex, String birth) {
        this.id = id;
        this.name = name;
        this.addr = addr;
        this.age = age;
        this.sex = sex;
        this.birth = birth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("name='" + name + "'")
                .add("addr='" + addr + "'")
                .add("age=" + age)
                .add("sex=" + sex)
                .add("birth='" + birth + "'")
                .toString();
    }
}
