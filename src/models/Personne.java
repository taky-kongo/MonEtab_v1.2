package models;

import java.util.Date;

public class Personne {

    private int id;
    private Date dateNaissance;
    private String ville;
    private String prenom;
    private String nom;
    private String telephone;

    // Les constructeurs

    public Personne() {
    }

    public Personne(int id, Date dateNaissance, String ville, String prenom, String nom) {
        this.id = id;
        this.dateNaissance = dateNaissance;
        this.ville = ville;
        this.prenom = prenom;
        this.nom = nom;
    }

    public Personne(int id, Date dateNaissance, String ville, String prenom, String nom, String telephone) {
        this.id = id;
        this.dateNaissance = dateNaissance;
        this.ville = ville;
        this.prenom = prenom;
        this.nom = nom;
        this.telephone = telephone;
    }

    // Les getters et setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
