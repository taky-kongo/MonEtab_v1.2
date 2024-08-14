package dao;

import models.Utilisateur;

import java.sql.SQLException;
import java.util.List;

public interface IUtilisateurDao {

    Utilisateur getUser(String identification, String motDePasse) throws SQLException;
    List<Utilisateur> getAllUser();
    void deleteCompte(String identifiant, String motDePasse);
    Utilisateur updateUser(String identifiant, String motDePasse);
    
}
