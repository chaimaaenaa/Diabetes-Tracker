package com.Service;

import com.Modeles.Repas;
import com.Repository.RepasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class RepasService {

    @Autowired
    private RepasRepository repasRepository;

    @Transactional
    public List<Repas> listRepas() {
        return repasRepository.findAll();
    }

    @Transactional
    public Optional<Repas> getRepasById(Long id) {
        return repasRepository.findById(id);
    }

    @Transactional
    public Repas saveRepas(Repas repas) {
        return repasRepository.save(repas);
    }

    @Transactional
    public void deleteRepas(Long id) {
        repasRepository.deleteById(id);
    }
}
