package examen;

public class Matiere {
    private String code;
    private String nom;
    private double coefficient;
    
    public Matiere(String code, String nom, double coefficient) {
        this.code = code;
        this.nom = nom;
        this.coefficient = coefficient;
    }
    
    public String getCode() {
        return code;
    }
    
    public String getNom() {
        return nom;
    }
    
    public double getCoefficient() {
        return coefficient;
    }
}
