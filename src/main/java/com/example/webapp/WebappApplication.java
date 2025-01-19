package com.example.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class WebappApplication {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "This is a spring boot web application built using Maven");
        model.addAttribute("msg", "The CI&CD pipeline for this application is designed using Jenkins");
        model.addAttribute("msg1", "This application is deployed on to Kubernetes using Argo CD");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(WebappApplication.class, args);
    }
}
