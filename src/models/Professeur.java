package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Professeur extends Personne {
    Scanner sc = new Scanner(System.in);
    List<Professeur> professeurs = new ArrayList<>();
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

    private Boolean vacant;
    private String matiereEnseigne;
    private String prochainCours;
    private String sujetProchaineReunion;

    // Les constructeurs

    public Professeur() {
    }

    public Professeur(int id, Date dateNaissance, String ville, String prenom, String nom, Boolean vacant) {
        super(id, dateNaissance, ville, prenom, nom);
        this.vacant = vacant;
    }

    public Professeur(int id, Date dateNaissance, String ville, String prenom, String nom, String telephone, Boolean vacant, String matiereEnseigne, String prochainCours, String sujetProchaineReunion) {
        super(id, dateNaissance, ville, prenom, nom, telephone);
        this.vacant = vacant;
        this.matiereEnseigne = matiereEnseigne;
        this.prochainCours = prochainCours;
        this.sujetProchaineReunion = sujetProchaineReunion;
    }

    // Les getters et les setters

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

    public Boolean getVacant() {
        return vacant;
    }

    public void setVacant(Boolean vacant) {
        this.vacant = vacant;
    }

    public String getMatiereEnseigne() {
        return matiereEnseigne;
    }

    public void setMatiereEnseigne(String matiereEnseigne) {
        this.matiereEnseigne = matiereEnseigne;
    }

    public String getProchainCours() {
        return prochainCours;
    }

    public void setProchainCours(String prochainCours) {
        this.prochainCours = prochainCours;
    }

    public String getSujetProchaineReunion() {
        return sujetProchaineReunion;
    }

    public void setSujetProchaineReunion(String sujetProchaineReunion) {
        this.sujetProchaineReunion = sujetProchaineReunion;
    }

    // Les méthodes

    /**
     * ajouter un nouveau professeur
     * @param professeur à ajouter
     * @return le professeur qui a été ajouté
     */
    /*
    public Professeur ajouter(Professeur professeur) {

        boolean continuer = false;
        int idAuto = 0;
        do {
            Date dateNaissance;
            int id =++idAuto;
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
            System.out.print("Ville: ");
            String ville = sc.nextLine();
            System.out.print("Prenom: ");
            String prenom = sc.nextLine();
            System.out.print("Nom: ");
            String nom = sc.nextLine();
            System.out.print("Vacant: ");
            boolean vacant = sc.nextBoolean();

            professeur = new Professeur(id, dateNaissance, ville, prenom, nom, vacant);

            System.out.println("\nLes informations du professeur\n");

            System.out.println("Id: " + professeur.getId());
            System.out.println("Date de naissance: " + formatter.format(professeur.getDateNaissance()));
            System.out.println("Ville: " + professeur.getVille());
            System.out.println("Prenom: " + professeur.getPrenom());
            System.out.println("Nom: " + professeur.getNom());
            System.out.println("Vacant: " + professeur.getVacant());

            professeurs.add(professeur);
            System.out.println("\nmodels.Professeur bien enregistré!");

            System.out.println("Saisir 1 pour Enregistrer un nouvel professeur ou 0 pour revenir au menu");
            int choix = sc.nextInt();
            sc.nextLine();

            switch (choix) {
                case 1:
                    System.out.println("\nEnregistrer un nouvel professeur\n");
                    break;
                case 0:
                    System.out.println("\nVous avez décidé de revenir au menu gestion des professeurs!");
                    continuer = true;
                    break;
            }
        } while (!continuer);

        return professeur;

    }*/

    /**
     * Affiche les informations du professeur
     * @param professeur est le paramètre à afficher
     */
    public void afficherInformationsProf(Professeur professeur) {

        System.out.println("\nLes informations du dernier professeur enregistré\n");

        if (professeurs.isEmpty()) {
            System.out.println("La liste est vide");
        } else {
            professeur = professeurs.get(professeurs.size() - 1);

            System.out.println("Id: " + professeur.getId());
            System.out.println("Date de naissance: " + formatter.format(professeur.getDateNaissance()));
            System.out.println("Ville: " + professeur.getVille());
            System.out.println("Prenom: " + professeur.getPrenom());
            System.out.println("Nom: " + professeur.getNom());
            System.out.println("Vacant: " + professeur.getVacant());
            System.out.println("Entrer 0 pour revenir au menu");
        }

    }


    /**
     * Permet de modifier les informations du professeur
     * @param professeur est l'élément à modifier
     * @return le professeur avec les informations modifiées
     */
    /*
    public Professeur modifier(Professeur professeur) {
        boolean continuer = false;
        do {

            if (professeurs.isEmpty()) {
                System.out.println("La liste est vide!");
            } else {
                professeur = professeurs.get(professeurs.size() - 1);
                System.out.println("Modifier le Id: ");
                professeur.setId(sc.nextInt());
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
                professeur.setDateNaissance(dateNaissance);
            }

            System.out.print("Modifier la ville: ");
            professeur.setVille(sc.nextLine());
            System.out.print("Modifier le Prenom: ");
            professeur.setPrenom(sc.nextLine());
            System.out.print("Modifier le Nom: ");
            professeur.setNom(sc.nextLine());
            System.out.print("Modifier poste Vacant: ");
            professeur.setVacant(sc.nextBoolean());


            System.out.println("\nLes nouvelles informations du professeur\n");

            System.out.println("Id: " + professeur.getId());
            System.out.println("Date de naissance: " + formatter.format(professeur.getDateNaissance()));
            System.out.println("Ville: " + professeur.getVille());
            System.out.println("Prenom: " + professeur.getPrenom());
            System.out.println("Nom: " + professeur.getNom());
            System.out.println("Vacant: " + professeur.getVacant());


            System.out.println("Saisir 1 pour modifier à nouveau ou 0 pour revenir au menu");
            int choix = sc.nextInt();
            sc.nextLine();

            switch (choix) {
                case 1:
                    System.out.println("\nModifier à nouveau le professeur\n");
                    break;
                case 0:
                    System.out.println("\nVous avez décidé de revenir au menu gestion des professeurs!");
                    continuer = true;
                    break;
            }
        } while (!continuer);

        return professeur;
    }*/

    /**
     * Permet de supprimer un professeur par son identifiant
     * @param identifiant est le paramètre à entrer pour supprimer
     */
    /*
    public void supprimer(int identifiant) {
        if (professeurs.isEmpty()) {
            System.out.println("La liste est vide!");
        } else if (identifiant >= professeurs.size()) {
            System.out.println("L'identifiant n'existe pas!");
        } else {
            professeurs.remove(professeurs.get(identifiant));
            System.out.println("Elève supprimé avec succès!");
        }
    }*/

    /**
     * Permet d'obtenir la liste des professeurs enregistrés
     * @return une liste de professeurs
     */
    /**
    public List<Professeur> obtenirProfesseur() {
        System.out.println("\nAffichage de la liste des professeurs\n");
        if (professeurs.isEmpty()) {
            System.out.println("La liste est vide!");
        } else {
            for (int i = 0; i < professeurs.size() - 1; i++) {
                Professeur professeur = professeurs.get(i);
                afficherInformationsProf(professeur);
            }
        }
        return List.of();
    }*/

    /**
     * Permet d'obtenir un professeur par son identifiant
     * @param identifiant est le paramètre à entrer
     */
    /**
    public void Obtenir(int identifiant) {

    }*/
}
