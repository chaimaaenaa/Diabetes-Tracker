package com.Controller;

import com.Modeles.Glycemie;
import com.Service.GlycemieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/glycemie")
public class GlycemieController {

    @Autowired
    private GlycemieService glycemieService;

    @GetMapping
    public String listGlycemies(Model model) {
        model.addAttribute("glycemies", glycemieService.listGlycemies());
        return "glycemie/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("glycemie", new Glycemie());
        return "glycemie/add";
    }

    @PostMapping("/add")
    public String addGlycemie(@ModelAttribute Glycemie glycemie) {
        glycemieService.saveGlycemie(glycemie);
        return "redirect:/glycemie";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Optional<Glycemie> glycemie = glycemieService.getGlycemieById(id);
        if (glycemie.isPresent()) {
            model.addAttribute("glycemie", glycemie.get());
            return "glycemie/edit";
        } else {
            return "redirect:/glycemie";
        }
    }

    @PostMapping("/edit/{id}")
    public String editGlycemie(@PathVariable Long id, @ModelAttribute Glycemie glycemie) {
        glycemie.setId(id);
        glycemieService.saveGlycemie(glycemie);
        return "redirect:/glycemie";
    }

    @GetMapping("/delete/{id}")
    public String deleteGlycemie(@PathVariable Long id) {
        glycemieService.deleteGlycemie(id);
        return "redirect:/glycemie";
    }
}
