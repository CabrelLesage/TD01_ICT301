import inscription.GestionEtudiant;
import inscription.Etudiant;
import examen.Matiere;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionEtudiant gestion = new GestionEtudiant();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez l'effectif de la classe: ");
        int effectif = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < effectif; i++) {
            System.out.print("Matricule: ");
            String matricule = scanner.nextLine();
            System.out.print("Nom: ");
            String nom = scanner.nextLine();
            System.out.print("Prenom: ");
            String prenom = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            gestion.ajouterEtudiant(matricule, nom, prenom, age);
        }

        System.out.print("Nombre de matières: ");
        int nbMatieres = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < nbMatieres; i++) {
            System.out.print("Code: ");
            String code = scanner.nextLine();
            System.out.print("Nom: ");
            String nom = scanner.nextLine();
            System.out.print("Coefficient: ");
            double coef = scanner.nextDouble();
            scanner.nextLine();
            gestion.ajouterMatiere(code, nom, coef);
        }

        for (Etudiant etudiant : gestion.getEtudiants()) {
            for (Matiere matiere : gestion.getMatieres()) {
                System.out.printf("Entrez la note de %s %s pour la matière %s: ", etudiant.getNom(), etudiant.getPrenom(), matiere.getNom());
                double note = scanner.nextDouble();
                scanner.nextLine();
                gestion.enregistrerNote(etudiant.getMatricule(), matiere.getNom(), note);
            }
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Afficher la liste des étudiants admis par ordre de mérite");
            System.out.println("2. Afficher le premier et le dernier étudiant");
            System.out.println("3. Afficher la moyenne de la classe");
            System.out.println("4. Afficher la liste des étudiants admis");
            System.out.println("5. Afficher la liste des étudiants ayant une moyenne supérieure à la moyenne de la classe");
            System.out.println("6. Quitter");

            System.out.print("Choisissez une option: ");
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    gestion.afficherEtudiantsParMerite();
                    break;
                case 2:
                    gestion.afficherPremierEtDernier();
                    break;
                case 3:
                    gestion.afficherMoyenneClasse();
                    break;
                case 4:
                    gestion.afficherEtudiantsAdmis();
                    break;
                case 5:
                    gestion.afficherEtudiantsSuperieursAMoyenneClasse();
                    break;
                case 6:
                    System.out.println("Au revoir!");
                    return;
                default:
                    System.out.println("Option invalide, veuillez réessayer.");
            }
        }
    }
}
