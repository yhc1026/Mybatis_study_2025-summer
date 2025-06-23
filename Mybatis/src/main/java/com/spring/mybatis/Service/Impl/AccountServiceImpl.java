package com.spring.mybatis.Service.Impl;

import com.spring.mybatis.Mappers.AccountMapper;
import com.spring.mybatis.Service.AccountService;
import com.spring.mybatis.Utils.idGenerator;
import com.spring.mybatis.entity.account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private idGenerator idgenerator;

    @Override
    public List<account> selectAll() {
        return accountMapper.selectAll();
    }

    @Override
    public account selectById(int id) {
        return accountMapper.selectById(id);
    }

    @Override
    public int insert(String username, String password, int age) {
        int id=idgenerator.generateRandomId();
        int count=0;
        try{
            count=accountMapper.insert(id, username, password, age);
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("insert failed");
            return -1;
        }
        return count;
    }
}
