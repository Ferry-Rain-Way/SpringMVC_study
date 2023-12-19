package com.vue.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vue.mapper.UserMapper;
import com.vue.pojo.User;
import com.vue.service.UserService;
import com.vue.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: 34838
 * @Date: 2023/3/22 00:23
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAllUser() {
        return userMapper.queryAllUser(null,null);
    }

    @Override
    public PageInfo<User> queryUserDataByPage(Integer page,Integer limit,String searchType,String searchContent) {
        //开启PageHelper的分页查询
        PageHelper.startPage(page,limit);
        /*
                执行查询语句
                注意:当开启PageHelper的分页查询功能后,在编写sql代码时
                    所写的就不是分页查询语句了,而是查找全部
                    但是返回的结果是分页后的
        */
        List<User> users = userMapper.queryAllUser(searchType,searchContent);
        // 获取分页信息对象
        PageInfo<User> userPageInfo = new PageInfo<>(users);
        System.out.println(users);

        return userPageInfo;
    }

    @Override
    public int addUser(User user) {
        //生成UUID
        String uuid = UUIDUtil.get16UUID();
        user.setId(uuid);
        return userMapper.addUser(user);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public int deleteUser(String id) {
        return userMapper.deleteUser(id);
    }
}
