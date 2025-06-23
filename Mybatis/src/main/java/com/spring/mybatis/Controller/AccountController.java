package com.spring.mybatis.Controller;

import com.spring.mybatis.Mappers.AccountMapper;
import com.spring.mybatis.Service.Impl.AccountServiceImpl;
import com.spring.mybatis.entity.account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class AccountController {

    @Autowired
    private AccountServiceImpl accountService;
    
    @PostMapping("/SelectAll")
    public List<account> selectAll() {
        return accountService.selectAll();
    }

    @PostMapping("/SelectById")
    public account selectById(int id) {
        return accountService.selectById(id);
    }

    @PostMapping("/insert")
    public int insert (String username, String password, int age) {
        return accountService.insert(username, password, age);
    }

    @PostMapping("/SelectInPages")
    private List<account> selectInPages() {
        return accountService.selectInPages();
    }
}
