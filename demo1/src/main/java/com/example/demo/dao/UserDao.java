package com.example.demo.dao;

import com.example.demo.model.user;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface UserDao {
    //插入
    int insert(user u);
    //删除
    int delete(int id);
    //修改
    int update(user u);
    //查询all
    List<user> query();
    //条件查询
    List<user> queryby(String u);
}