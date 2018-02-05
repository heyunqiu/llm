package com.llm.controller;

import com.llm.domain.user.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by dev on 2018/2/5.
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public String getHello(Model model){
        User user = new User();
        user.setUsername("测试账号");
        user.setPassword("1234we");
        user.setRoleList(new ArrayList<String>(){{add("ROLE_ADMIN");}});
        model.addAttribute("userList",new ArrayList<User>(){{add(user);add(user);}});
        return "userList";
    }
}
