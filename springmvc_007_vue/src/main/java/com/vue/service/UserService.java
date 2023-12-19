package com.vue.service;

import com.github.pagehelper.PageInfo;
import com.vue.pojo.User;

import java.util.List;

/**
 * @Auther: 34838
 * @Date: 2023/3/22 00:24
 * @Description:
 */
public interface UserService {
     List<User>  selectAllUser();

     PageInfo<User> queryUserDataByPage(Integer page,Integer limit,String searchType,String searchContent);

     int addUser(User user);

     int updateUser(User user);

     int deleteUser(String id);


}
