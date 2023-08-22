package com.example.produit.Model;
import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Produit  implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String categorie;
    private String prix;

    public Produit() {
    }
    public String getCategorie() {
        return categorie;
    }
    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
    
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
      public String getPrix() {
        return prix;
    }
    public void setPrix(String prix) {
        this.prix = prix;
    }
        public String toString() {
        return "Produit [id=" + id + ", nom=" + nom + ", categorie=" + categorie + ", prix=" + prix + "]";
    }
    public Produit(Long id, String nom, String categorie, String prix) {
        this.id = id;
        this.nom = nom;
        this.categorie = categorie;
        this.prix = prix;
    }
}
