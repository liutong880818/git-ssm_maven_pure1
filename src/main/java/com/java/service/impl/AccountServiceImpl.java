package com.java.service.impl;

import com.github.pagehelper.PageHelper;
import com.java.mapper.AccountMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Description: 描述
 * Date: 2020/6/30 22:19
 * author: LT
 */
@Service
public class AccountServiceImpl implements com.java.service.AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public List<Map<String,Object>> findAccounts(Integer pageNum, Integer pageSize){
        //分页
        PageHelper.startPage(pageNum,pageSize);
        return accountMapper.selectAccounts();
    }

}
