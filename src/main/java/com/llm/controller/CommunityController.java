package com.llm.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hyq on 2018/2/6.
 */
@Controller
@RequestMapping("/community")
public class CommunityController {
    @RequestMapping("/getDynamic")
    public String getDynamic(){
        System.out.print("xx");
        return "dynamic";
    }
}
