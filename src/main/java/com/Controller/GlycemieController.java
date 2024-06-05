package com.Controller;

import com.Service.GlycemieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class GlycemieController {
    @Autowired
    private GlycemieService glycemieService;

    @GetMapping(value = "/glycemie")
    public String displayGlycemieForm(Model model){
        
    }

}

