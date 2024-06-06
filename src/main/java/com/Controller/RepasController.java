package com.Controller;

import com.Modeles.Repas;
import com.Service.RepasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/repas")
public class RepasController {

    @Autowired
    private RepasService repasService;

    @GetMapping
    public String listRepas(Model model) {
        model.addAttribute("repas", repasService.listRepas());
        return "repas/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("repas", new Repas());
        return "addRepas";
    }

    @PostMapping("/add")
    public String addRepas(@ModelAttribute Repas repas) {
        repasService.saveRepas(repas);
        return "redirect:/addRepas";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Optional<Repas> repas = repasService.getRepasById(id);
        if (repas.isPresent()) {
            model.addAttribute("repas", repas.get());
            return "repas/edit";
        } else {
            return "redirect:/repas";
        }
    }

    @PostMapping("/edit/{id}")
    public String editRepas(@PathVariable Long id, @ModelAttribute Repas repas) {
        repas.setId(id);
        repasService.saveRepas(repas);
        return "redirect:/repas";
    }

    @GetMapping("/delete/{id}")
    public String deleteRepas(@PathVariable Long id) {
        repasService.deleteRepas(id);
        return "redirect:/repas";
    }
}
