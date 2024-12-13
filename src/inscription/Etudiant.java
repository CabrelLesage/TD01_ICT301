package inscription;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import examen.Matiere;

public class Etudiant {
    private String matricule;
    private String nom;
    private String prenom;
    private int age;
    private Map<String, Double> notes;

    public Etudiant(String matricule, String nom, String prenom, int age) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.notes = new HashMap<>();
    }

    public void ajouterNote(String matiere, double note) {
        notes.put(matiere, note);
    }

    public double calculerMoyenne(List<Matiere> matieres) {
        double totalPoints = 0;
        double totalCoefficients = 0;
        for (Matiere matiere : matieres) {
            if (notes.containsKey(matiere.getNom())) {
                totalPoints += notes.get(matiere.getNom()) * matiere.getCoefficient();
                totalCoefficients += matiere.getCoefficient();
            }
        }
        return totalCoefficients > 0 ? totalPoints / totalCoefficients : 0;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMatricule() {
        return matricule;
    }
}
