package com.nfjh.ssm.controller;

import com.nfjh.ssm.pojo.User;
import com.nfjh.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: 34838
 * @Date: 2023/2/6 13:34
 * @Description:
 */

/**
 * 。你不需要在每个 @RequestMapping 方法上都增加一
 * 个 @ResponseBody 注解，更简明的做法是，给你的控制器加上一个 @RestController 的注解。
 * @RestController 是一个原生内置的注解，它结合了 @ResponseBody 与 @Controller 注解的功
 * 能。不仅如此，它也让你的控制器更表义，而且在框架未来的发布版本中，它也可能承载更
 * 多的意义。
 */
@CrossOrigin //支持服务器端跨域
@RestController
@RequestMapping("/user")

public class UserController {
//    private final static Integer PAGE_SIZE = 5;
//    private UserService  userService ;
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }

    /**
     * /user/selectUserPage?userName=z&userSex=男&page=null
     * 根据条件分页获取分页数据
     * @param userName
     * @param userSex
     * @param page
     * @return 通过jackson-databind 自动转化为JSON
     */
//    @RequestMapping("/selectUserPage")
//    public List<User> selectUserPage(String userName,String userSex,Integer page){
//        //startRow 起始行 = (需要显示第几页 -1) * 页面记录条数;
//        int startRow = (page-1)*PAGE_SIZE;
//        return userService.selectUserPage(userName,userSex,startRow);
//    }


    //切记切记:一定会有业务逻辑层的对象
    @Autowired
    UserService userService;

    public static final int PAGE_SIZE = 5;

    //user/selectUserPage?userName=z&userSex=男&page=null
    @RequestMapping("/selectUserPage")

    public List<User> selectUserPage(String userName,String userSex,Integer page){
        //根据页码计算起始行
        int startRow = 0;
        if(page != null){
            startRow = (page-1) * PAGE_SIZE;
        }

        return userService.selectUserPage(userName,userSex,startRow);
    }
    ///user/getRowCount?userName=z&userSex=男
    @RequestMapping("/getRowCount")

    public int getRowCount(String userName,String userSex){
        return userService.getRowCount(userName,userSex);
    }
    ///user/deleteUserById?userId= 15968162087363060
    @RequestMapping("/deleteUserById")

    public int deleteUserById(String userId){
        return userService.deleteUserById(userId);
    }

    ///user/createUser(参数见下面)
    @RequestMapping("/createUser")

    public int createUser(User user){
        String userId = System.currentTimeMillis()+"";
        user.setUserId(userId);
        return userService.createUser(user);
    }
}
