package com.laughing.shardingsphere.controller;

import com.laughing.shardingsphere.dao.Dict;
import com.laughing.shardingsphere.dao.User;
import com.laughing.shardingsphere.dao.UserOrder;
import com.laughing.shardingsphere.service.DictService;
import com.laughing.shardingsphere.service.UserOrderService;
import com.laughing.shardingsphere.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    @Autowired
    private UserOrderService userOrderService;
    @Autowired
    private DictService dictService;

    @GetMapping("/get")
    public List<User> getUser() {
        return userService.getAll();
    }

    @GetMapping("/get2")
    public List<UserOrder> getOrder() {
        return userOrderService.getAllOrder();
    }

    /**
     * User奇、偶ID插入测试方法
     *
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


    /**
     * Order奇、偶ID插入测试方法
     *
     * @return
     */
    @GetMapping("/insert/test2/")
    private int insertTset2() {
        Long userId = userService.getAll().get(0).getId();
        UserOrder order = new UserOrder();
        order.setOrderText("xxxxxxxxxxx");
        return userOrderService.addUserOrder(order);
    }

    @GetMapping("/insert/test3/")
    private int insertTset3() {
        Long userId = userService.getAll().get(0).getId();
        Long oderId = userOrderService.getAllOrder().get(0).getOrderId();
        Dict dict = new Dict();
        dict.setOrderId(userId);
        dict.setUserId(oderId);
        dict.setStatus("1");
        return dictService.insert(dict);
    }

}
