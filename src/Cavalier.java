public class Cavalier extends Soldat {

    private int charge;
    private double vitesseMax;

    public Cavalier(String nom, int poids, int charge) {
        super(nom, poids);
        this.charge = charge;

        if (charge > 150) {
            this.charge = 150;
        }

        if (this.charge == 0) {
            this.vitesseMax = 15;
        }
        else if (this.charge < 50) {
            this.vitesseMax = 13;
        }
        else if (this.charge <= 100) {
            this.vitesseMax = 10;
        }
        else {
            this.vitesseMax = 8;
        }
    }

    public void prendreCharge(int charge) {
        this.charge = charge;

        if (this.charge > 150) {
            this.charge = 150;
        }

        if (this.charge == 0) {
            this.vitesseMax = 15;
        }
        else if (this.charge < 50) {
            this.vitesseMax = 13;
        }
        else if (this.charge <= 100) {
            this.vitesseMax = 10;
        }
        else {
            this.vitesseMax = 8;
        }
    }

    public void decharger() {
        this.charge = 0;
        this.vitesseMax = 15;
    }

    public double getVitesseMax() {
        return this.vitesseMax;
    }

    public void setVitesseMax(double vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    @Override
    public double vitesseMaximale() {

        if (charge == 0) {
            return 15;
        }
        else if (charge < 50) {
            return 13;
        }
        else if (charge <= 100) {
            return 10;
        }
        else {
            return 8;
        }

    }

    @Override
    public String toString() {
        return super.toString() +
                ", type : Cavalier " +
                ", charge : " + this.charge;
    }

}