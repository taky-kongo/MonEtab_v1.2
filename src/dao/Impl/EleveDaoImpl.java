package dao.Impl;

import dao.IEleveDao;
import dao.SingletonDataBase;
import models.Eleve;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class EleveDaoImpl implements IEleveDao {
    @Override
    public Eleve ajouter(Eleve eleve) {
        return null;
    }

    @Override
    public void modifier(Eleve eleve) {
    }

    @Override
    public boolean supprimer(int identifiant) {

        String deleteEleveQuery = "DELETE FROM eleve WHERE id_Personne = ?";
        String deletePersonneQuery = "DELETE FROM personne WHERE id_Personne = ?";

        boolean estSupprimer = false;

        try {
            // Exécution de la requête DELETE
            PreparedStatement deleteStmtEleve = SingletonDataBase.getInstance().prepareStatement(deleteEleveQuery);
            PreparedStatement deleteStmtPersonne = SingletonDataBase.getInstance().prepareStatement(deletePersonneQuery);
            deleteStmtEleve.setInt(1, identifiant);
            deleteStmtPersonne.setInt(1, identifiant);

            int rowsAffectedEleve = deleteStmtEleve.executeUpdate();
            int rowsAffectedPersonne = deleteStmtPersonne.executeUpdate();

            if (rowsAffectedEleve > 0 && rowsAffectedPersonne > 0) {
                System.out.println("L'élève avec l'identifiant " + identifiant + " a été supprimé.");
                estSupprimer = true;
            }else {
                System.out.println("Aucun élève trouvé avec l'  " + identifiant + ". Suppression non effectuée.");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return estSupprimer;
    }

    @Override
    public List<Eleve> obtenirEleve() {
        return List.of();
    }

    @Override
    public void obtenir(int identifiant) {

    }
}
