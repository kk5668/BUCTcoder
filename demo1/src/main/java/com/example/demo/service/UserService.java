package com.example.demo.service;
import com.example.demo.dao.UserDao;
import com.example.demo.model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserDao ud;
    public int insert(user u){
        return ud.insert(u);
    };
    //删除
    public int delete(int id){
        return ud.delete(id);
    };
    //修改
    public int update(user u){
        return ud.update(u);
    };
    //查询all
    public List<user> query(){
        return ud.query();
    };
    //条件查询
    public user queryby(String c){
        System.out.println("service:"+c);
        return (user) ud.queryby(c);
    };
}