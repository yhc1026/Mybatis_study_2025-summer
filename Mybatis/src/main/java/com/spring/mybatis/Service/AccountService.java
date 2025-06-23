package com.spring.mybatis.Service;

import com.spring.mybatis.entity.account;

import java.util.List;

public interface AccountService {
    public List<account> selectAll();
    public account selectById(int id);
    public int insert(String username, String password, int age);
}
