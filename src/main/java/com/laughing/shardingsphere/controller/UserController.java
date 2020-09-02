package com.laughing.shardingsphere.controller;

import com.laughing.shardingsphere.dao.User;
import com.laughing.shardingsphere.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Fu zihao
 * @version 1.0
 * @Description:
 * @date 20202020/9/2 14:48
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/get")
    public String getUser() {
        return "";
    }

    /**
     * 奇、偶ID插入测试方法
     * @return
     */
    @GetMapping("/insert/test/")
    private int insertTset() {
        User user = new User();
        user.setName("laughing");
        user.setAddress("xxxxxxx");
        user.setAge(10);
        return userService.addUser(user);
    }


}
