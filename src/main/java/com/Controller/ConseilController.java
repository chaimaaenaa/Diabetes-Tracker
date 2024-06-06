package com.Controller;

import com.Modeles.Conseil;
import com.Service.ConseilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/conseils")
public class ConseilController {

    @Autowired
    private ConseilService conseilService;

    @GetMapping
    public String getAllConseils(Model model) {
        List<Conseil> conseils = conseilService.getAllConseils();
        model.addAttribute("conseils", conseils);
        return "displayConseils"; // Nom du fichier JSP pour afficher les conseils
    }

    @GetMapping("/add")
    public String addConseilForm(Model model) {
        model.addAttribute("conseil", new Conseil());
        return "addConseil";
    }

    @PostMapping("/add")
    public String addConseil(@ModelAttribute Conseil conseil) {
        conseilService.addConseil(conseil);
        //return "redirect:/conseils";
        return null;
    }

    @GetMapping("/edit/{id}")
    public String editConseilForm(@PathVariable Long id, Model model) {
        Conseil conseil = conseilService.getConseilById(id).orElseThrow(() -> new IllegalArgumentException("Invalid conseil Id:" + id));
        model.addAttribute("conseil", conseil);
        return "editConseil"; // Nom du fichier JSP pour le formulaire de modification de conseil
    }

    @PostMapping("/update/{id}")
    public String updateConseil(@PathVariable Long id, @ModelAttribute Conseil conseil) {
        conseil.setIdC(id);
        conseilService.updateConseil(conseil);
        return "redirect:/conseils";
    }

    @GetMapping("/delete/{id}")
    public String deleteConseil(@PathVariable Long id) {
        conseilService.deleteConseil(id);
        return "redirect:/conseils";
    }
}
