package dao.Impl;

import dao.IUtilisateurDao;
import dao.SingletonDataBase;
import models.Utilisateur;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UtilisateurDaoImpl implements IUtilisateurDao {

    private static final String QUERY_GET_USER_BY_PSEUDO_AND_PASSWORD = "SELECT * FROM utilisateur WHERE pseudo = ? AND motDePasse = ?";

    @Override
    public Utilisateur getUser(String identification, String motDePasse) throws SQLException {
        PreparedStatement statement = SingletonDataBase.getInstance().prepareStatement(QUERY_GET_USER_BY_PSEUDO_AND_PASSWORD);
        statement.setString(1, identification);
        statement.setString(2, motDePasse);
        ResultSet resultSet = statement.executeQuery();
        Utilisateur utilisateur = null;

        if (resultSet.next()) {
            int id = resultSet.getInt("id_Utilisateur");
            String pseudo = resultSet.getString("pseudo");
            String motDepasse = resultSet.getString("motDePasse");
            utilisateur = new Utilisateur(id, pseudo, motDepasse);
        }
        return utilisateur;
    }

    @Override
    public List<Utilisateur> getAllUser() {
        return List.of();
    }

    @Override
    public void deleteCompte(String identifiant, String motDePasse) {

    }

    @Override
    public Utilisateur updateUser(String identifiant, String motDePasse) {
        return null;
    }
}
