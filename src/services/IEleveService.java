package services;

import models.Eleve;

import java.util.List;

public interface IEleveService {

    Eleve save(Eleve eleve);

    void update(Eleve eleve);

    boolean delete(int identifiant);

    List<Eleve> getAllEleve();

    void getOne(int identifiant);
}
