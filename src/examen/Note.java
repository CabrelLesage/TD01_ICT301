package examen;

import inscription.Etudiant;

public class Note {
    private Matiere matiere;
    private Etudiant etudiant;
    private double valeur;

    public Note(Matiere matiere, Etudiant etudiant, double valeur) {
        this.matiere = matiere;
        this.etudiant = etudiant;
        this.valeur = valeur;
    }

    public double getValeur() {
        return valeur;
    }

    public Matiere getMatiere() {
        return matiere;
    }
}
