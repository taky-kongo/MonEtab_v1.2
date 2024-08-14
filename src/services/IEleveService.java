package services;

import models.Eleve;

import java.util.List;

public interface IEleveService {

    Eleve save(Eleve eleve);

    Eleve update(Eleve eleve);

    void delete(int identifiant);

    List<Eleve> getAllEleve();

    void getOne(int identifiant);
}
