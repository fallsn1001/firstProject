package cn.jiyun.druid05.controller;

import cn.jiyun.druid05.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/findAll")
       public String findAll(Model model){
        model.addAttribute("emps",userMapper.findAll());
        return  "list";
    }



}
