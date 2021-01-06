package com.java.controller.admin;

import com.github.pagehelper.PageInfo;
import com.java.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Description: 描述
 * Date: 2020/6/30 21:24
 * author: LT
 */
@Controller
@RequestMapping("/admin/")
public class AdminController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("test")
    public @ResponseBody String test(){
        return "hello ssm";
    }

    @RequestMapping("getAccounts")
    public @ResponseBody List<Map<String,Object>> getAccounts(Integer pageNum, Integer pageSize){
        List<Map<String, Object>> accountList = accountService.findAccounts(pageNum,pageSize);
        PageInfo<Map<String, Object>> pageInfo = new PageInfo<>(accountList);
        return pageInfo.getList();
    }

}
