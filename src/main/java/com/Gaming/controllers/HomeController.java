package com.Gaming.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String index() {
        return "/html/home";
    }

    @GetMapping(value = "/login")
    public String login() {
        return "html/login";
    }

    @GetMapping(value="/dota2")
    public String dota2(Model model){
        return "/html/dota2";
    }

    @GetMapping(value="/cs2")
    public String cs2(Model model){
        return "/html/cs2";
    }
    @GetMapping(value="/valorant")
    public String valorant(Model model){
        return "/html/valorant";
    }

    @GetMapping(value="/fortnite")
    public String fortnite(Model model){
        return "/html/fortnite";
    }

    @GetMapping(value="/overwatch")
    public String owerwatch2(Model model){
        return "/html/overwatch";
    }





    @GetMapping(value="/soon")
    public String soon(Model model){
        return "/html/soon";
    }





}
