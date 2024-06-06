package com.Service;

import com.Modeles.Glycemie;
import com.Repository.LectureGlycemieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class GlycemieService {

    @Autowired
    private LectureGlycemieRepository lectureGlycemieRepository;

    @Transactional
    public List<Glycemie> listGlycemies() {
        return lectureGlycemieRepository.findAll();
    }

    @Transactional
    public Optional<Glycemie> getGlycemieById(Long id) {
        return lectureGlycemieRepository.findById(id);
    }

    @Transactional
    public Glycemie saveGlycemie(Glycemie glycemie) {
        return (Glycemie) lectureGlycemieRepository.save(glycemie);
    }

    @Transactional
    public void deleteGlycemie(Long id) {
        lectureGlycemieRepository.deleteById(id);
    }
}
