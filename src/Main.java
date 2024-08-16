import models.Eleve;
import models.Professeur;
import models.Utilisateur;
import services.IUtilisateurServive;
import services.impl.EleveServiceImpl;
import services.impl.UtilisateurServiceImpl;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);

        Utilisateur utilisateur = new Utilisateur();
        utilisateur.ajouterUtilisateurDefaut();
        boolean authenticathed = false;
        do {
            System.out.println("""
                
                    *********************************************
                        BIENVENU DANS L'APPLICATION ETAB v1.3
                    *********************************************
                
                                    CONNEXION
                """);
            System.out.print("Identifiant: ");
            String identifiant = (sc.nextLine());
            System.out.print("Mot de passe: ");
            String motDePasse = (sc.nextLine());

            IUtilisateurServive utilisateurServive = new UtilisateurServiceImpl();
            authenticathed = utilisateurServive.authentification(identifiant, motDePasse);
            System.out.println(authenticathed ? "\nConnexion réussie" : "\nReprenez SVP!");
        } while (!authenticathed);

        afficherLeMenu();
    }

    /**
     * Permet d'afficher le menu et d'entrer les différentes options
     */
    public static void afficherLeMenu() {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat formatHeure = new SimpleDateFormat("HH:mm");
        Date date = new Date();

        boolean estSortie = false;
        do {
            System.out.println("""
                    
                        *********************************************
                            BIENVENU DANS L'APPLICATION ETAB v1.3
                        *********************************************
                    
                    MENU:
                    
                        1: Gestion des élèves
                        2: Gestion des professeurs
                        3: Gestion des utilisateurs
                        0: Quitter
                    
                    """);
            System.out.println("Date système: " + formatHeure.format(date));

            System.out.println();
            System.out.println("Entrer un nombre valide");
            int choix = sc.nextInt();

            switch (choix) {
                case 1:
                    gererEleve();
                    break;
                case 2:
                    gererProfesseur();
                    break;
                case 3:
                    gererUtilisateur();
                    break;
                case 0:
                    System.out.println("J'espère que vous avez apprécié notre application. A bientot!");
                    estSortie = true;
                    break;
                default:
                    System.out.println("Nombre non valide. Entrez un nombre valide SVP!");
                    break;
            }
        } while (!estSortie);
    }

    /**
     * Permet de gérer le menu professeur
     */
    public static void gererProfesseur() {
        Scanner sc = new Scanner(System.in);
        Professeur professeur = new Professeur();

        boolean estSortie = false;
        do {
            System.out.println("""
                    
                        *********************************************
                                   GESTION DES PROFESSEURS
                        *********************************************
                    
                    MENU:
                    
                        1: Ajouter un professeur
                        2: Supprimer un professeur
                        3: Modifier les informations du professeur
                        4: Lister les professeurs
                        5: Obtenir le dernier professeur ajouté
                        6: Retour
                        0: Quitter
                    
                    """);

            System.out.println("Entrer un nombre valide");
            int choix = sc.nextInt();

            switch (choix) {
                case 1:
                    professeur.ajouter(professeur);
                    break;
                case 2:
                    while (true) {
                        System.out.println("Entrer l'iddentifiant du professuer à supprimer");
                        int identifiant = sc.nextInt();
                        sc.nextLine();
                        //professeur.supprimer(identifiant);
                        System.out.println("Voulez vous supprimer un autre professeur ? Entrez o pour supprimer à nouveau");
                        String decision = sc.nextLine().toLowerCase();
                        if (decision.equals("o")) {
                            continue;
                        } else {
                            break;
                        }
                    }
                    break;
                case 3:
                    //professeur.modifier(professeur);
                    break;
                case 4:
                    //professeur.obtenirProfesseur();
                    break;
                case 5:
                    professeur.afficherInformationsProf(professeur);
                    break;
                case 6:
                    afficherLeMenu();
                    estSortie = true;
                    break;
                case 0:
                    estSortie = true;
                    break;
            }
        } while (!estSortie);
    }

    /**
     * Permet de gérer le menu eleve
     */
    public static void gererEleve() {
        EleveServiceImpl eleveServiceImpl = new EleveServiceImpl();
        Scanner sc = new Scanner(System.in);
        Eleve eleve = new Eleve();

        boolean estSortie = false;
        do {
            System.out.println("""
                
                    *********************************************
                              GESTION DES UTILISATEURS
                    *********************************************
                
                MENU:
                
                    1: Ajouter un élève
                    2: Supprimer un élève
                    3: Modifier les informations de  utilisateur
                    4: Lister les élèves
                    6: Retour
                    0: Accueil
                
                """);

            System.out.println("Entrer un nombre valide");
            int choix = sc.nextInt();

            switch (choix) {
                case 1:
                    //eleve.ajouter(eleve);
                    break;
                case 2:
                    while (true) {
                        System.out.println("Entrer l'identifiant de l'élève à supprimer");
                        int identifiant = sc.nextInt();
                        sc.nextLine();
                        boolean value = eleveServiceImpl.delete(identifiant);
                        System.out.println("Voulez vous supprimer un autre élève ? Entrez o pour supprimer à nouveau");
                        String decision = sc.nextLine().toLowerCase();
                        if (decision.equals("o")) {
                            continue;
                        } else {
                            break;
                        }
                    }
                    break;
                case 3:
                    //eleve.modifier(eleve);
                    break;
                case 4:
                    //eleve.obtenirEleve();
                    break;
                case 5:
                    eleve.afficherInformationsEleve(eleve);
                    break;
                case 6:
                    afficherLeMenu();
                    estSortie = true;
                    break;
                case 0:
                    estSortie = true;
                    break;
            }
        } while (estSortie);
    }

    /**
     * Permet de gérer le menu utilisateur
     */
    public static void gererUtilisateur() {
        System.out.println("""
                
                    *********************************************
                                GESTION DES ELEVES
                    *********************************************
                
                MENU:
                
                    1: Ajouter un utilisateur
                    2: Supprimer un utilisateur
                    3: Modifier les informations de l'utilisateur
                    4: Lister les utilisateurs
                    5: Retour
                    0: Quitter
                
                """);
    }
}