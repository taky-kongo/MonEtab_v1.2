package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Eleve extends Personne {
    Scanner sc = new Scanner(System.in);
    List<Eleve> eleves = new ArrayList<>();
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    String classe;
    String matricule;

    // Les constructeurs

    public Eleve() {
    }

    public Eleve(int id, Date dateNaissance, String ville, String prenom, String nom, String classe) {
        super(id, dateNaissance, ville, prenom, nom);
        this.classe = classe;
    }

    public Eleve(int id, Date dateNaissance, String ville, String prenom, String nom, String telephone, String classe, String matricule) {
        super(id, dateNaissance, ville, prenom, nom, telephone);
        this.classe = classe;
        this.matricule = matricule;
    }

    // Les getters et setters

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getId() {
        return super.getId();
    }

    public void setId(int id) {
        super.setId(id);
    }

    public Date getDateNaissance() {
        return super.getDateNaissance();
    }

    public void setDateNaissance(Date dateNaissance) {
        super.setDateNaissance(dateNaissance);
    }

    public String getVille() {
        return super.getVille();
    }

    public void setVille(String ville) {
        super.setVille(ville);
    }

    public String getPrenom() {
        return super.getPrenom();
    }

    public void setPrenom(String prenom) {
        super.setPrenom(prenom);
    }

    public String getNom() {
        return super.getNom();
    }

    public void setNom(String nom) {
        super.setNom(nom);
    }

    public String getTelephone() {
        return super.getTelephone();
    }

    public void setTelephone(String telephone) {
        super.setTelephone(telephone);
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    // Les méthodes

    /**
     * Affiche les informations de l'élève
     * @param eleve est le paramètre à afficher
     */
    public void afficherInformationsEleve(Eleve eleve) {
        Scanner sc = new Scanner(System.in);
        boolean continuer;
        do {
            System.out.println("\nLes informations du dernier élève enregistré\n");

            if (eleves.isEmpty()) {
                System.out.println("La liste est vide");
            } else {
                eleve = eleves.get(eleves.size() - 1);

                System.out.println("Id eleve: " + eleve.getId());
                System.out.println("Date de naissance eleve: " + sdf.format(eleve.getDateNaissance()));
                System.out.println("Ville: " + eleve.getVille());
                System.out.println("Prenom: " + eleve.getPrenom());
                System.out.println("Nom: " + eleve.getNom());
                System.out.println("Classe: " + eleve.getClasse());
                System.out.println("Entrer 0 pour revenir au menu");
            }

            System.out.println("\nEntrer 0 pour sortir");
            int choix = sc.nextInt();
            continuer = choix == 0;
        } while (!continuer);
    }

    /**
     * ajouter un nouveau élève
     * @param eleve à ajouter
     * @return l'élève qui a été ajouté
     */
    /*
    @Override
    public Eleve ajouter(Eleve eleve) {

        boolean continuProgramme = false;
        int idEleveAuto = 0;
        do {
            Date dateDeNaissance;
            int id =++idEleveAuto;
            while (true) {
                System.out.print("Date Naissance au (format: jj-mm-aaaa): ");
                String dateNaissanceString = sc.nextLine();
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                try {
                    dateDeNaissance = formatter.parse(dateNaissanceString);
                    break;
                } catch (ParseException e) {
                    System.out.println("Format de date invalide. Veuillez utiliser le format jj-mm-aaaa.");
                }
            }
            System.out.print("Ville: ");
            String ville = sc.nextLine();
            System.out.print("Prenom: ");
            String prenom = sc.nextLine();
            System.out.print("Nom: ");
            String nom = sc.nextLine();
            System.out.print("Classe: ");
            String classe = sc.nextLine();

            eleve = new Eleve(id, dateDeNaissance, ville, prenom, nom, classe);

            System.out.println("\nLes informations de l' élève\n");

            System.out.println("Id eleve: " + eleve.getId());
            System.out.println("Date de naissance: " + sdf.format(eleve.getDateNaissance()));
            System.out.println("Ville: " + eleve.getVille());
            System.out.println("Prenom: " + eleve.getPrenom());
            System.out.println("Nom: " + eleve.getNom());
            System.out.println("Vacant: " + eleve.getClasse());

            eleves.add(eleve);
            System.out.println("\nElève bien enregistré!");

            System.out.println("Saisir 1 pour Enregistrer un nouvel professeur ou 0 pour revenir au menu");
            int choix = sc.nextInt();
            sc.nextLine();

            switch (choix) {
                case 1:
                    System.out.println("\nEnregistrer un nouvel élève\n");
                    break;
                case 0:
                    System.out.println("\nVous avez décidé de revenir au menu gestion des eleves!");
                    continuProgramme = true;
                    break;
            }
        } while (!continuProgramme);

        return eleve;
    }
    */
    /**
     * Permet de modifier les informations de l'élève
     * @param eleve est l'élément à modifier
     * @return l'élève avec les informations modifiées
     */
    /*
    @Override
    public Eleve modifier(Eleve eleve) {
        boolean continuer = false;
        do {

            if (eleves.isEmpty()) {
                System.out.println("La liste est vide!");
            } else {
                eleve = eleves.get(eleves.size() - 1);
                System.out.println("Modifier le Id: ");
                eleve.setId(sc.nextInt());
                sc.nextLine();
                Date dateNaissance;
                while (true) {
                    System.out.print("Date Naissance au (format: jj-mm-aaaa): ");
                    String dateNaissanceString = sc.nextLine();
                    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                    try {
                        dateNaissance = formatter.parse(dateNaissanceString);
                        break;
                    } catch (ParseException e) {
                        System.out.println("Format de date invalide. Veuillez utiliser le format jj-mm-aaaa.");
                    }
                }
                eleve.setDateNaissance(dateNaissance);
            }

            System.out.print("Modifier la ville: ");
            eleve.setVille(sc.nextLine());
            System.out.print("Modifier le Prenom: ");
            eleve.setPrenom(sc.nextLine());
            System.out.print("Modifier le Nom: ");
            eleve.setNom(sc.nextLine());
            System.out.print("Modifier la classe: ");
            eleve.setClasse(sc.nextLine());


            System.out.println("\nLes nouvelles informations de l'élève\n");

            System.out.println("Id: " + eleve.getId());
            System.out.println("Date de naissance: " + sdf.format(eleve.getDateNaissance()));
            System.out.println("Ville: " + eleve.getVille());
            System.out.println("Prenom: " + eleve.getPrenom());
            System.out.println("Nom: " + eleve.getNom());
            System.out.println("Vacant: " + eleve.getClasse());


            System.out.println("Saisir 1 pour modifier à nouveau ou 0 pour revenir au menu");
            int choix = sc.nextInt();
            sc.nextLine();

            switch (choix) {
                case 1:
                    System.out.println("\nModifier à nouveau l'élève\n");
                    break;
                case 0:
                    System.out.println("\nVous avez décidé de revenir au menu gestion des professeurs!");
                    continuer = true;
                    break;
            }
        } while (!continuer);

        return eleve;
    }*/

    /**
     * Permet de supprimer un élève par son identifiant
     * @param identifiant est le paramètre à entrer pour supprimer
     */
    /*
    @Override
    public void supprimer(int identifiant) {
        if (eleves.isEmpty()) {
            System.out.println("La liste est vide!");
        } else if (identifiant >= eleves.size()) {
            System.out.println("L'identifiant n'existe pas!");
        } else {
            eleves.remove(eleves.get(identifiant));
            System.out.println("Elève supprimé avec succès!");
        }
    }
    */
    /**
     * Permet d'obtenir la liste des élèves enregistrés
     * @return une liste d'élèves
     */
    /*
    @Override
    public List<Eleve> obtenirEleve() {
        System.out.println("\nAffichage de la liste des professeurs\n");
        if (eleves.isEmpty()) {
            System.out.println("La liste est vide!");
        } else {
            for (int i = 0;
                 i < eleves.size() - 1; i++) {
                Eleve eleve = eleves.get(i);
                afficherInformationsEleve(eleve);
            }
        }
        return List.of();
    }*/
}
