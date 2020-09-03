package com.laughing.shardingsphere.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.laughing.shardingsphere.dao.UserOrder;
import com.laughing.shardingsphere.mapper.UserOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Fu zihao
 * @version 1.0
 * @Description:
 * @date 20202020/9/3 10:36
 */
@Service
public class UserOrderService {
    @Autowired
    private UserOrderMapper userOrderMapper;


    /**
     * 单条插入
     * @param userOrder
     * @return
     */
    public int addUserOrder(UserOrder userOrder) {
        return userOrderMapper.insert(userOrder);
    }


    /**
     * 查询全部
     * @return
     */
    public List<UserOrder> getAllOrder(){
        QueryWrapper<UserOrder> userQueryWrapper = new QueryWrapper<>();
        return userOrderMapper.selectList(userQueryWrapper);

    }
}
