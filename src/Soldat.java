public abstract class Soldat {

    private String nom;
    private int poids;
    private double vitesseMax;

    public Soldat(String nom, int poids) {
        this.nom = nom;
        this.poids = poids;
    }

    public int getPoids() {
        return this.poids;
    }

    public double getVitesseMax() {
        return this.vitesseMax;
    }

    public void setVitesseMax(double vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    public abstract double vitesseMaximale();

    @Override
    public String toString() {
        return "Nom : " + this.nom +
                ", poids : " + this.poids;
    }

}