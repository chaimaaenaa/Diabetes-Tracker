package com.Controller;

//    @PostMapping("/adding")
//    public String saveGlycemie(@RequestParam("niveauGlycemie") Double niveauGlycemie,
//                               @RequestParam("date") LocalDate date,
//                               @RequestParam("heure") LocalTime heure,
//                               @RequestParam("idU") Long idU,
//                               Model model) {
//
//        Optional<User> userOptional = UserService.getUserById(idU);
//        if (userOptional.isPresent()) {
//            User user = userOptional.get();
//            Glycemie glycemie = new Glycemie(date, heure, niveauGlycemie, user);
//            glycemieService.saveGlycemie(glycemie);
//            return "redirect:/glycemie/list";
//        } else {
//            model.addAttribute("errorMessage", "User not found");
//            return "addGlycemie";
//        }
//    }

import com.Modeles.Glycemie;
import com.Modeles.User;
import com.Service.GlycemieService;
import com.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;

@Controller
@RequestMapping("/glycemie")
public class GlycemieController {

    @Autowired
    private GlycemieService glycemieService;

    @Autowired
    private UserService userService ;

    @GetMapping("/list")
    public String listGlycemies(Model model) {
        model.addAttribute("glycemies", glycemieService.listGlycemies());
        return "listGlycemie"; // Correction du nom de la vue
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
                              Model model) {
        System.out.println("ffff");
        Glycemie glycemie = null;
        glycemieService.saveGlycemie(glycemie);
        glycemie = new Glycemie(date, heure, niveauGlycemie);

        return "redirect:/glycemie/list";
    }

//    @GetMapping("/edit/{id}")

//    public String showEditForm(@PathVariable Long id, Model model) {
//        Optional<Glycemie> glycemie = glycemieService.getGlycemieById(id);
//        if (glycemie.isPresent()) {
//            model.addAttribute("glycemie", glycemie.get());
//            return "editGlycemie"; // Correction du nom de la vue
//        } else {
//            return "redirect:/glycemie/list";
//        }
//    }

//@GetMapping("/edit/{id}")
//public String showEditForm(@PathVariable Long id, Model model) {
//    Glycemie glycemie = glycemieService.getGlycemieById(id)
//            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Glycemie not found"));
//    model.addAttribute("glycemie", glycemie);
//    return "editGlycemie";
//}
//
//
//    @PostMapping("/edit")
//    public String editGlycemie(@PathVariable Long id, @ModelAttribute Glycemie glycemie) {
//        glycemie.setId(id);
//        glycemieService.saveGlycemie(glycemie);
//        return "redirect:/glycemie/list";
//    }

    @GetMapping("/delete/{id}")
    public String deleteGlycemie(@PathVariable Long id) {
        glycemieService.deleteGlycemie(id);
        return "redirect:/glycemie/list";
    }
}