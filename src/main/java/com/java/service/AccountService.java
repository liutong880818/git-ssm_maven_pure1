package com.java.service;

import java.util.List;
import java.util.Map;

/**
 * Description: 描述
 * Date: 2020/6/30 22:26
 * author: LT
 */
public interface AccountService {
    List<Map<String,Object>> findAccounts(Integer pageNum, Integer pageSize);
}
