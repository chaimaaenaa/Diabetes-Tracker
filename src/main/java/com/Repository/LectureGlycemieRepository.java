package com.Repository;


import com.Modeles.Conseil;
import com.Modeles.Glycemie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LectureGlycemieRepository extends JpaRepository<Glycemie, Long> {
}
