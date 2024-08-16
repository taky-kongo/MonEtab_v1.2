package dao.Impl;

import dao.IProfesseurDao;
import dao.SingletonDataBase;
import models.Professeur;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ProfesseurDaoImpl implements IProfesseurDao {
    @Override
    public Professeur ajouter(Professeur professeur) {
        String query = "INSERT INTO personne () values(? , ? , ? , ? , ? , ?)";

        try {
            PreparedStatement stmt = SingletonDataBase.getInstance().prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);

            stmt.setString(1, null);
            stmt.setString(2, professeur.getNom());
            stmt.setString(3, professeur.getPrenom());
            stmt.setString(4, professeur.getVille());
            stmt.setString(5, professeur.getTelephone());
            stmt.setObject(6, professeur.getDateNaissance());

            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            int dernierIdInsere = 0;

            if (rs.next()) {
                dernierIdInsere = rs.getInt(1);
            }
            professeur.setId(dernierIdInsere);

            String query1 = "INSERT INTO professeur values(? , ? , ?)";
            PreparedStatement stmt1 = SingletonDataBase.getInstance().prepareStatement(query1);

            stmt1.setString(1 , null);
            stmt1.setBoolean(2 , professeur.getVacant());
            stmt1.setInt(3 , dernierIdInsere);

            stmt1.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return professeur;
    }

    @Override
    public Professeur modifier(Professeur professeur) {
        return null;
    }

    @Override
    public void supprimer(int identifiant) {

    }

    @Override
    public List<Professeur> obtenirProfesseur() {
        return List.of();
    }

    @Override
    public void obtenir(int identifiant) {

    }
}
