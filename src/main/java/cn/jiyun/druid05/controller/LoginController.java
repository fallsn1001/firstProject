package cn.jiyun.druid05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

@Controller
@RequestMapping("/login")
public class LoginController {
    @PostMapping("/login")
    public String login(@RequestParam("username")String username,
                        @RequestParam("password")String password,
                        Model model){
        if (!StringUtils.isEmpty(username) && "123".equals(password)){
            return "dashboard";
        }else {
            model.addAttribute("error","密码或账号不正确");
            return "login";
        }
    }
}
