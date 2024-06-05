package com.Modeles;

import com.Modeles.User;

import javax.persistence.*;

@Entity
@Table(name = "conseil")
public class Conseil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idC;
    private String titre;
    private String description;
    private Long id;

    public Conseil(Long idC, String titre, String description ,Long id) {
        this.idC = id;
        this.titre = titre;
        this.description = description;
        this.id = id;
    }

    public Long getIdC() {
        return idC;
    }

    public void setIdC(Long idC) {
        this.idC = idC;
    }

    public Conseil() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
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
//    public String getTitre() {
//        return titre;
//    }
//
//    public void setTitre(String titre) {
//        this.titre = titre;
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
