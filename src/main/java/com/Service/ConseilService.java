package com.Service;

import com.Modeles.Conseil;
import com.Repository.ConseilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;

@Service
public class ConseilService {

    @Autowired
    private ConseilRepository conseilRepository;

    // Méthode pour ajouter un nouveau conseil
    public Conseil addConseil(Conseil conseil) {
        return conseilRepository.save(conseil);
    }

    // Méthode pour récupérer un conseil par son id
    public Optional<Conseil> getConseilById(Long idC) {
        return conseilRepository.findById(idC);
    }

    // Méthode pour récupérer tous les conseils
    public List<Conseil> getAllConseils() {
        return conseilRepository.findAll();
    }

    // Méthode pour mettre à jour un conseil existant
    public Conseil updateConseil(Conseil conseil) {
        if (conseilRepository.existsById(conseil.getIdC())) {
            return conseilRepository.save(conseil);
        }
        return null; // Ou vous pouvez lever une exception si le conseil n'existe pas
    }

    // Méthode pour supprimer un conseil par son id
    public void deleteConseil(Long idC) {
        conseilRepository.deleteById(idC);
    }
}
