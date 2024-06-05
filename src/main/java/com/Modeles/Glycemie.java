package com.Modeles;

import com.Modeles.User;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "glycemie")
public class Glycemie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private LocalTime heure;
    private Double niveauGlycemie;
    private  Long idU ;

    public Glycemie(Long id, LocalDate date, LocalTime heure, Double niveauGlycemie, Long idU) {
        this.id = id;
        this.date = date;
        this.heure = heure;
        this.niveauGlycemie = niveauGlycemie;
        this.idU = idU;
    }

    public Long getIdU() {
        return idU;
    }

    public void setIdU(Long idU) {
        this.idU = idU;
    }

    public Glycemie(LocalTime heure, Long id, LocalDate date, Double niveauGlycemie) {
        this.heure = heure;
        this.id = id;
        this.date = date;
        this.niveauGlycemie = niveauGlycemie;
    }

    public Glycemie() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getHeure() {
        return heure;
    }

    public void setHeure(LocalTime heure) {
        this.heure = heure;
    }

    public Double getNiveauGlycemie() {
        return niveauGlycemie;
    }

    public void setNiveauGlycemie(Double niveauGlycemie) {
        this.niveauGlycemie = niveauGlycemie;
    }
    //    @ManyToOne
//    @JoinColumn(name = "utilisateur_id")
//    private User utilisateur;
//
//    // Getters et Setters
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public LocalDate getDate() {
//        return date;
//    }
//
//    public void setDate(LocalDate date) {
//        this.date = date;
//    }
//
//    public LocalTime getHeure() {
//        return heure;
//    }
//
//    public void setHeure(LocalTime heure) {
//        this.heure = heure;
//    }
//
//    public Double getNiveauGlycemie() {
//        return niveauGlycemie;
//    }
//
//    public void setNiveauGlycemie(Double niveauGlycemie) {
//        this.niveauGlycemie = niveauGlycemie;
//    }
//
//    public User getUtilisateur() {
//        return utilisateur;
//    }
//
//    public void setUtilisateur(User utilisateur) {
//        this.utilisateur = utilisateur;
//    }
}
