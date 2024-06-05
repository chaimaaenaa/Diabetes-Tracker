package com.Modeles;

import com.Modeles.User;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "repas")
public class Repas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idR;
    private String nom;
    private LocalDate date;
    private String description;
    private Long id;

    public Repas(Long idR, String nom, LocalDate date, String description) {
        this.idR = idR;
        this.nom = nom;
        this.date = date;
        this.description = description;
    }

    public Repas(Long idR, String nom, String description, LocalDate date, Long id) {
        this.idR = idR;
        this.nom = nom;
        this.description = description;
        this.date = date;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Repas() {
    }

    public Long getIdR() {
        return idR;
    }

    public void setIdR(Long idR) {
        this.idR = idR;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
//    public String getNom() {
//        return nom;
//    }
//
//    public void setNom(String nom) {
//        this.nom = nom;
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
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
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
