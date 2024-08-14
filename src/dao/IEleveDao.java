package dao;

import models.Eleve;

import java.util.List;

public interface IEleveDao {

    Eleve ajouter(Eleve eleve);

    Eleve modifier(Eleve eleve);

    void supprimer(int identifiant);

    List<Eleve> obtenirEleve();

    void obtenir(int identifiant);
}
