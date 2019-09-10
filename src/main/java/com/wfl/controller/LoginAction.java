package com.wfl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author SPC-044
 * @date 16:16
 * @Version 1.0
 */
@Controller
@RequestMapping("/login")
public class LoginAction {

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "index";
    }
}
