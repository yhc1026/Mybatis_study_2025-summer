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
        account acc = accountMapper.selectById(id);
        if(acc==null){
            return null;
        }
        else{
            return accountMapper.selectById(id);
        }
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

    @Override
    public List<account> selectInPages() {
        List<account> list=null;
        try {
            //TODO:分页查询实现
            list = accountMapper.selectInPages(0, 5, 5, 5);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("selectInPages failed");
            return null;
        }
        return list;
    }
}
