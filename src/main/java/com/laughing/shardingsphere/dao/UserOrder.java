package com.laughing.shardingsphere.dao;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Fu zihao
 * @version 1.0
 * @Description:
 * @date 20202020/9/3 10:34
 */
@Data
public class UserOrder {
    private Long orderId;
    private String orderText;
    private Long userId;
}
