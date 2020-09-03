package com.laughing.shardingsphere.dao;

import lombok.Data;

/**
 * @author Fu zihao
 * @version 1.0
 * @Description: user\order关联表
 * @date 20202020/9/3 13:54
 */
@Data
public class Dict {
    private Long dictId;
    private Long userId;
    private Long orderId;
    private String status;
}
