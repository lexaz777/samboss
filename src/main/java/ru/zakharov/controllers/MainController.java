package ru.zakharov.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/")
    public String shoeHomePage() {
        return "index";
    }

    @RequestMapping("favicon.png")
    String appFavicon() {
        return "forward:/resources/images/favicon.ico";
    }
}
