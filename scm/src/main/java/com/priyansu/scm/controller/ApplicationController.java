package com.priyansu.scm.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/api/application")
public class ApplicationController {

    @RequestMapping("/home")
    public String home(Model model) {
        log.info("Home page handler invoked!");

        //data
        model.addAttribute("name", "HUMAN NAME i.e PRIYANSU");
        model.addAttribute("email", "priyansu@gmail.com");
        return "home";
    }
}
