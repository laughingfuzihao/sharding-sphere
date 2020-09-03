package com.laughing.shardingsphere.service;

import com.laughing.shardingsphere.dao.Dict;
import com.laughing.shardingsphere.mapper.DictMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Fu zihao
 * @version 1.0
 * @Description: 公共表操作
 * @date 20202020/9/3 13:57
 */
@Service
public class DictService {
    @Autowired
    private DictMapper dictMapper;

    /**
     * 公共表添加
     * @param dict
     * @return
     */
    public int insert(Dict dict){
       return dictMapper.insert(dict);
    }
}
