package com.Gaming.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String index(Model model) {

//        ArrayList<Items> items = DBManager.getItems();
//        model.addAttribute("tovary", items);
        return "/html/home";
    }

    @GetMapping(value = "/about")
    public String about() {
        return "/html/about";
    }

//    @GetMapping(value = "/about")
//    public String about() {
//        return "about";
//    }

//    @PostMapping(value = "/add-item")
//    public String addItem(
//            @RequestParam(name = "item_name", defaultValue = "No Item") String name,
//            @RequestParam(name = "item_price", defaultValue = "0") int price) {
//
//        DBManager.addItem(new Items(null, name, price));
//        return "redirect:/";
//    }

//    @GetMapping(value= "/details/{id}")
//    public String details(Model model, @PathVariable(name = "id") Long id){
//        Items item = DBManager.getItems(id);
//        model.addAttribute("item", item);
//        return "details";
//    }

    @GetMapping(value = "/403")
    public String accessDenied(Model model) {
        return "403";
    }


}
