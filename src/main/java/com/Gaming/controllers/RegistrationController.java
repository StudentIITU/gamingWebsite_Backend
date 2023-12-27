package com.Gaming.controllers;



import com.Gaming.entities.GamerEntity;
import com.Gaming.service.GamerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@AllArgsConstructor
public class RegistrationController {
    GamerService gamerService;

    @GetMapping("/signup")
    public String registration(Model model) {
        model.addAttribute("gamerEntity", new GamerEntity());
        return "html/signup";
    }

    @PostMapping("/signup")
    public String registration(@ModelAttribute("gamerEntity") GamerEntity gamerEntity, Model model) {
        gamerService.saveGamer(gamerEntity);
        return "redirect:/html/login";
    }


}
