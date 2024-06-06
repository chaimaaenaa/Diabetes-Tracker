package com.Repository;


import com.Modeles.Conseil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LectureGlycemieRepository<Glycemie> extends JpaRepository<Glycemie, Long> {
}
