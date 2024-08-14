package models;

import dao.SingletonDataBase;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

public class Utilisateur {
    Scanner sc = new Scanner(System.in);

    private int id;
    private String pseudo;
    private String identifiant;
    private String motDePasse;
    private Date dateCreation;

    // Les constructeurs

    public Utilisateur() {
    }

    public Utilisateur(int id, String identifiant, String motDePasse) {
        this.id = id;
        this.identifiant = identifiant;
        this.motDePasse = motDePasse;
    }

    public Utilisateur(int id, String pseudo, String motDePasse, Date dateCreation) {
        this.id = id;
        this.pseudo = pseudo;
        this.motDePasse = motDePasse;
        this.dateCreation = dateCreation;
    }

    // Les getters et setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    // Les méthodes

    public void ajouterUtilisateurDefaut() {

        try {
            String query = "INSERT INTO utilisateur (pseudo, motDePasse, dateCreation, id_Utilisateur) VALUES (?, ?, CURDATE(), 1)";
            PreparedStatement statement = SingletonDataBase.getInstance().prepareStatement(query);
            statement.setString(1, "admin");
            statement.setString(2, "admin");
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
