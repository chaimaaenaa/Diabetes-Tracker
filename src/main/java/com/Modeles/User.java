package com.Modeles;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idU;
    private String nom;
    private String prenom;
    private String email;
    private String motDePasse;


    public User(Long idU, String nom, String prenom, String email, String motDePasse) {
        this.idU = idU;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.motDePasse = motDePasse;
    }

    public User() {
    }

    public Long getIdU() {
        return idU;
    }

    public void setIdU(Long idU) {
        this.idU = idU;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
    //    @OneToMany(mappedBy = "utilisateur")
//    private List<Glycemie> glycemies;
//
//    @OneToMany(mappedBy = "utilisateur")
//    private List<Conseil> conseils;
//
//    @OneToMany(mappedBy = "utilisateur")
//    private List<Repas> repas;
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
//    public String getPrenom() {
//        return prenom;
//    }
//
//    public void setPrenom(String prenom) {
//        this.prenom = prenom;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getMotDePasse() {
//        return motDePasse;
//    }
//
//    public void setMotDePasse(String motDePasse) {
//        this.motDePasse = motDePasse;
//    }
//
//    public List<Glycemie> getGlycemies() {
//        return glycemies;
//    }
//
//    public void setGlycemies(List<Glycemie> glycemies) {
//        this.glycemies = glycemies;
//    }
//
//    public List<Conseil> getConseils() {
//        return conseils;
//    }
//
//    public void setConseils(List<Conseil> conseils) {
//        this.conseils = conseils;
//    }
//
//    public List<Repas> getRepas() {
//        return repas;
//    }
//
//    public void setRepas(List<Repas> repas) {
//        this.repas = repas;
//    }
}
