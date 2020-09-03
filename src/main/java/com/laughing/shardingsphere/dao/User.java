package com.laughing.shardingsphere.dao;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

/**
 * @author Fu zihao
 * @version 1.0
 * @Description:
 * @date 20202020/9/2 14:44
 */
@Data
public class User {
    private Long id;
    private String name;
    private int age;
    private String address;
}
