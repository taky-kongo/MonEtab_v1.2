package services.impl;

import dao.Impl.ProfesseurDaoImpl;
import models.Professeur;
import services.IProfesseurService;

import java.util.List;
import java.util.Scanner;

public class ProfesseurServiceImpl implements IProfesseurService {

    private final ProfesseurDaoImpl professeurDaoImpl;
    static Scanner scanner = new Scanner(System.in);

    public ProfesseurServiceImpl() {
        this.professeurDaoImpl = new ProfesseurDaoImpl();
    }

    @Override
    public Professeur save(Professeur professeur) {
        return this.professeurDaoImpl.ajouter(professeur);
    }

    @Override
    public Professeur update(Professeur professeur) {
        return null;
    }

    @Override
    public void delete(int identifiant) {

    }

    @Override
    public List<Professeur> getAllProfesseur() {
        return List.of();
    }

    @Override
    public void getOne(int identifiant) {

    }
}
