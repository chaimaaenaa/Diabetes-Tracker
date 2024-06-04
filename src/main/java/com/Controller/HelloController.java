package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Bienvenue dans l'application de suivi du diabète !");
        return "home";
    }



}
