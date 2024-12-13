package inscription;

import examen.Matiere;
import java.util.ArrayList;
import java.util.List;

public class GestionEtudiant {
    public List<Etudiant> etudiants;
    private List<Matiere> matieres;

    public GestionEtudiant() {
        this.etudiants = new ArrayList<>();
        this.matieres = new ArrayList<>();
    }

    public void ajouterEtudiant(String matricule, String nom, String prenom, int age) {
        etudiants.add(new Etudiant(matricule, nom, prenom, age));
    }

    public void ajouterMatiere(String code, String nom, double coefficient) {
        matieres.add(new Matiere(code, nom, coefficient));
    }

    public void enregistrerNote(String matricule, String nomMatiere, double note) {
        Etudiant etudiant = etudiants.stream()
                .filter(e -> e.getMatricule().equals(matricule))
                .findFirst().orElse(null);
        if (etudiant != null) {
            etudiant.ajouterNote(nomMatiere, note);
        }
    }

    public void afficherEtudiantsParMerite() {
        etudiants.stream()
                .sorted((e1, e2) -> Double.compare(e2.calculerMoyenne(matieres), e1.calculerMoyenne(matieres)))
                .forEach(e -> System.out.printf("%s - %s %s: Moyenne = %.2f\n", e.getMatricule(), e.getNom(), e.getPrenom(), e.calculerMoyenne(matieres)));
    }

    public void afficherPremierEtDernier() {
        if (!etudiants.isEmpty()) {
            List<Etudiant> sortedEtudiants = new ArrayList<>(etudiants);
            sortedEtudiants.sort((e1, e2) -> Double.compare(e2.calculerMoyenne(matieres), e1.calculerMoyenne(matieres)));
            Etudiant premier = sortedEtudiants.get(0);
            Etudiant dernier = sortedEtudiants.get(sortedEtudiants.size() - 1);
            System.out.printf("Premier: %s %s - Moyenne = %.2f\n", premier.getNom(), premier.getPrenom(), premier.calculerMoyenne(matieres));
            System.out.printf("Dernier: %s %s - Moyenne = %.2f\n", dernier.getNom(), dernier.getPrenom(), dernier.calculerMoyenne(matieres));
        }
    }

    public void afficherMoyenneClasse() {
        double totalMoyennes = etudiants.stream().mapToDouble(e -> e.calculerMoyenne(matieres)).sum();
        double moyenneClasse = etudiants.isEmpty() ? 0 : totalMoyennes / etudiants.size();
        System.out.printf("Moyenne de la classe: %.2f\n", moyenneClasse);
    }

    public void afficherEtudiantsAdmis() {
        etudiants.stream()
                .filter(e -> e.calculerMoyenne(matieres) >= 10)
                .forEach(e -> System.out.printf("%s %s - Moyenne = %.2f\n", e.getNom(), e.getPrenom(), e.calculerMoyenne(matieres)));
    }

    public void afficherEtudiantsSuperieursAMoyenneClasse() {
        double moyenneClasse = etudiants.stream().mapToDouble(e -> e.calculerMoyenne(matieres)).average().orElse(0);
        etudiants.stream()
                .filter(e -> e.calculerMoyenne(matieres) > moyenneClasse)
                .forEach(e -> System.out.printf("%s %s - Moyenne = %.2f\n", e.getNom(), e.getPrenom(), e.calculerMoyenne(matieres)));
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public List<Matiere> getMatieres() {
        return matieres;
    }
}
