package com.vue.controller;

import com.github.pagehelper.PageInfo;
import com.vue.pojo.User;
import com.vue.service.UserService;
import com.vue.utils.UUIDUtil;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

//注意此处一定要写成@RestController 代表是一个AJAX请求
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 获取所有用户数据
     * @return
     */
    @RequestMapping("/getUser")
    public List<User> selectAllUser() {
        return userService.selectAllUser();
    }


    /**
     * 借助PageHelper插件进行分页查询 携带条件
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping("/pageSelectUser")
    public PageInfo<User> selectUserByPage(Integer page,Integer limit,String searchType,String searchContent){
       //get请求携带参数,Accept: application/json, text/plain, */*

        return userService.queryUserDataByPage(page,limit, searchType, searchContent);
    }


    /**
     *添加用户
     *  注意此处的@RequestBody 不能省略一定要加上
     *  可以解决请求头的Content-Type问题
     *  https://blog.csdn.net/u011066470/article/details/112502544
     * @param user
     * @return
     */

    @RequestMapping("/addUser")
    public void addUser(@RequestBody User user){
         userService.addUser(user);
    }

    /**
     * 更新用户数据
     * @param user
     * @return
     */
    @RequestMapping("/updateUser")
    public void updateUser(@RequestBody User user){
         userService.updateUser(user);
    }

    /**
     * 根据指定id删除用户
     * @param map
     */
    @RequestMapping("/deleteUser")
    public void deleteUser(@RequestBody HashMap<String, String> map){
        String id = map.get("id");

        userService.deleteUser(id);
    }
}
