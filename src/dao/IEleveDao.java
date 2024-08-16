package dao;

import models.Eleve;

import java.util.List;

public interface IEleveDao {

    Eleve ajouter(Eleve eleve);

    void modifier(Eleve eleve);

    boolean supprimer(int identifiant);

    List<Eleve> obtenirEleve();

    void obtenir(int identifiant);
}
