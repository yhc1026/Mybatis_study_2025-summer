package com.spring.mybatis.Mappers;
import com.spring.mybatis.entity.account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Mapper
@Repository
public interface AccountMapper {

    public List<account> selectAll();
    public account selectById(int id);
    public int insert(int id, String username, String password, int age);

    //TODO:分页查询实现
    public List<account> selectInPages(int offset1, int limit1, int offset2, int limit2);
}
