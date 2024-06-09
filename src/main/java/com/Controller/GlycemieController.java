package com.Controller;

import com.Modeles.Glycemie;
import com.Modeles.User;
import com.Service.GlycemieService;
import com.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;

@Controller
@RequestMapping("/glycemie")
public class GlycemieController {

    @Autowired
    private GlycemieService glycemieService;

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public String listGlycemies(Model model) {
        model.addAttribute("glycemies", glycemieService.listGlycemies());
        return "listGlycemie";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("glycemie", new Glycemie());
        return "addGlycemie";
    }

    @PostMapping("/add")
    public String addGlycemie(@RequestParam("date") LocalDate date,
                              @RequestParam("heure") LocalTime heure,
                              @RequestParam("niveauGlycemie") Double niveauGlycemie,
                              @RequestParam("idU") Long idU,
                              Model model) {
        Optional<User> userOptional = Optional.ofNullable(userService.getUserById(idU));
        if (userOptional.isPresent()) {
            User user = userOptional.get();

            Glycemie glycemie = new Glycemie(date, heure, niveauGlycemie, idU);
            glycemieService.saveGlycemie(glycemie);
            return "redirect:/glycemie/list";
        } else {
            model.addAttribute("errorMessage", "User not found");
            return "addGlycemie";
        }
    }

    @GetMapping("/delete/{id}")
    public String deleteGlycemie(@PathVariable Long id) {
        glycemieService.deleteGlycemie(id);
        return "redirect:/glycemie/list";
    }
}
