package com.java.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * Description: 描述
 * Date: 2020/6/30 21:36
 * author: LT
 */
public interface AccountMapper {

    /**
     * 查询所有用户信息
     * @return
     */
    @Select("select * from account")
    List<Map<String,Object>> selectAccounts();
}
