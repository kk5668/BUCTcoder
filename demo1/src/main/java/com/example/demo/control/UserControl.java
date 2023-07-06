package com.example.demo.control;
import com.example.demo.model.user;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
@Controller
@RequestMapping("/user")
public class UserControl {
    /*author:tjn
      date:2020.09.11
       arm:springboot+mybatis的增删改查询
     */
    @Autowired
    private UserService us;
    //增加
    @RequestMapping("/insert")
    public String adduser(@RequestBody user u){
        int i=us.insert(u);
        return "index";
    }
    //删除
    @RequestMapping("/delete")
    public String deleteuser(@RequestParam("id")  int id){
        us.delete(id);
        //页面跳转到查询所有的页面
        return "redirect:/user/query";
    }

    //修改
    @RequestMapping("/update")
    public String update(user u){
        us.update(u);
        return "redirect:/user/query";
    }

    //查询所有
    @RequestMapping("/query")
    public String queryall(Model model){
        List<user> list=us.query();
        model.addAttribute("list",list);
        return "/all";
    }

    //条件查询
    @RequestMapping("/qby")
    public String query(@RequestParam int id,Model model){
        user u=us.queryby(String.valueOf(id));
        //把这个user显示在页面上面
        model.addAttribute("user",u);
        return "/update";
    }
    //
}