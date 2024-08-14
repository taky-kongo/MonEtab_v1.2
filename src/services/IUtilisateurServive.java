package services;

import models.Utilisateur;

import java.sql.SQLException;
import java.util.List;

public interface IUtilisateurServive {
    public boolean authentification(String identifiant, String motDePasse) throws SQLException;
    Utilisateur ajouterUtilisateur(String identification, String motDePasse);
    public List<Utilisateur> obtenirUtilisateurs();
    public void supprimerCompte(String identifiant, String motDePasse);
    Utilisateur modifierUtilisateur(String identifiant, String motDePasse);
}
