package services.impl;

import dao.IUtilisateurDao;
import dao.Impl.UtilisateurDaoImpl;
import models.Utilisateur;
import services.IUtilisateurServive;

import java.sql.SQLException;
import java.util.List;

public class UtilisateurServiceImpl implements IUtilisateurServive {
    private IUtilisateurDao utilisateurDao;

    public UtilisateurServiceImpl() {
        this.utilisateurDao = new UtilisateurDaoImpl();
    }

    @Override
    public boolean authentification(String identifiant, String motDePasse) throws SQLException {
        Utilisateur user = utilisateurDao.getUser(identifiant, motDePasse);
        return user != null;
    }

    @Override
    public Utilisateur ajouterUtilisateur(String identification, String motDePasse) {
        return null;
    }

    @Override
    public List<Utilisateur> obtenirUtilisateurs() {
        return List.of();
    }

    @Override
    public void supprimerCompte(String identifiant, String motDePasse) {

    }

    @Override
    public Utilisateur modifierUtilisateur(String identifiant, String motDePasse) {
        return null;
    }


}
