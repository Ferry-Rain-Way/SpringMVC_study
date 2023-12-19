package com.vue.mapper;

import com.vue.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: 34838
 * @Date: 2023/3/22 00:17
 * @Description:
 */
@Repository
public interface UserMapper {

    List<User> queryAllUser(@Param("searchType") String searchType,@Param("searchContent") String searchContent);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(String id);

}
