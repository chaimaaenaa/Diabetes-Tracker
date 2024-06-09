package com.Repository;

import com.Modeles.Glycemie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GlycemieRepository extends JpaRepository<Glycemie, Long> {

    @Query("SELECT MAX(g.idU) FROM Glycemie g")
    Optional<Long> findMaxIdU();
}
