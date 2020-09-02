package com.laughing.shardingsphere.service;

import com.laughing.shardingsphere.dao.User;
import com.laughing.shardingsphere.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Fu zihao
 * @version 1.0
 * @Description:
 * @date 20202020/9/2 14:48
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 单条插入
     * @param user
     * @return
     */
    public int addUser(User user) {
        return userMapper.insert(user);
    }

}
