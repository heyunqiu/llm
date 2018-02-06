package com.llm;

import com.llm.domain.user.User;
import com.llm.domain.user.repository.UserRepository;
import com.llm.finalvalue.AuthorType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

/**
 * Created by hyq on 2018/2/6.
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest
public class CmnTests {
    @Autowired
    private UserRepository userRepository;
    @Test
    public void addUser(){
        User uAdmin = new User();
        uAdmin.setRoleList(new ArrayList<String>(){{add(AuthorType.ROLE_ADMIN.name());}});
        uAdmin.setPassword("abc123");
        uAdmin.setUsername("系统管理员");
        uAdmin.setAccount("admin");

        User uVip = new User();
        uVip.setRoleList(new ArrayList<String>(){{add(AuthorType.ROLE_VIP.name());add(AuthorType.ROLE_USER.name());}});
        uVip.setPassword("abc123");
        uVip.setUsername("vip用户");
        uVip.setAccount("vip");

        User uUser = new User();
        uUser.setRoleList(new ArrayList<String>(){{add(AuthorType.ROLE_USER.name());}});
        uUser.setPassword("abc123");
        uUser.setUsername("普通用户");
        uUser.setAccount("user");

        userRepository.save(new ArrayList<User>(){{
            add(uAdmin);
            add(uVip);
            add(uUser);
        }});
    }
}
