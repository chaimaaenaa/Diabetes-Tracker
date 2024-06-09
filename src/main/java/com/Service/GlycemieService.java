package com.Service;

import com.Modeles.Glycemie;
import com.Repository.GlycemieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GlycemieService {

    @Autowired
    private GlycemieRepository glycemieRepository;

    public List<Glycemie> listGlycemies() {
        return glycemieRepository.findAll();
    }

    public void saveGlycemie(Glycemie glycemie) {
        glycemieRepository.save(glycemie);
    }

    public Optional<Glycemie> getGlycemieById(Long id) {
        return glycemieRepository.findById(id);
    }

    public void deleteGlycemie(Long id) {
        glycemieRepository.deleteById(id);
    }

    public Long generateNewIdU() {
        // Retrieve the maximum idU from the repository and increment it
        return glycemieRepository.findMaxIdU().orElse(0L) + 1;
    }
}
