package services.impl;

import dao.Impl.EleveDaoImpl;
import models.Eleve;
import services.IEleveService;

import java.util.List;

public class EleveServiceImpl implements IEleveService {

    private final EleveDaoImpl eleveDaoImpl;

    public EleveServiceImpl(){
        this.eleveDaoImpl = new EleveDaoImpl();
    }
    @Override
    public Eleve save(Eleve eleve) {
        return null;
    }

    @Override
    public void update(Eleve eleve) {
    }

    @Override
    public boolean delete(int identifiant) {
        return this.eleveDaoImpl.supprimer(identifiant);
    }

    @Override
    public List<Eleve> getAllEleve() {
        return List.of();
    }

    @Override
    public void getOne(int identifiant) {

    }
}
