package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/phone")
    public String admin() {
        return "/admin/phone";
    }

    @RequestMapping("/gmail")
    public String gmail() {
        return "/admin/gmail";
    }
}