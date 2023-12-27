package com.Gaming.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gaming")  // Adjust the base URL as needed
public class ProfileController {

    @GetMapping("/profile")
    public String showProfile(Model model) {
        return "html/profile";  // Thymeleaf templates are typically located in "src/main/resources/templates"
    }
}