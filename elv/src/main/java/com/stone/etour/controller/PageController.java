package com.stone.etour.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  用来跳转页面
 */

@Controller
@RequestMapping("/page")
public class PageController {

    @RequestMapping("/to_login")
    public String toLoginPage() {
        return "login";
    }

    @RequestMapping("/to_register")
    public String toRegPage() {
        return "register";
    }

    @RequestMapping("/to_addTour")
    public String toaddTourPage() {
        return "addTour";
    }

    @RequestMapping("/to_admin")
    public String toAdminPage() {
        return "admin";
    }

    @RequestMapping("/to_user")
    public String toUserPage() {
        return "user";
    }

    @RequestMapping("/to_order")
    public String toOrderPage() {
        return "order";
    }


}
