public class Brancardier extends SoldatTransporteur {

    public Brancardier(String nom, int poids, int charge) {
        super(nom, poids, charge);

        if (this.getCharge() > 60) {
            this.setCharge(60);
        }

        this.mettreAJourVitesse();
    }

    @Override
    public void mettreAJourVitesse() {

        if (this.getCharge() > 60) {
            this.setCharge(60);
        }

        if (this.getPoids() < 85) {
            this.setVitesseMax(7);
        }
        else if (this.getPoids() <= 95) {
            this.setVitesseMax(6.6);
        }
        else {
            this.setVitesseMax(6);
        }

        if (this.getCharge() > 0) {

            if (this.getCharge() < this.getPoids() / 3.0) {
                this.setVitesseMax(this.getVitesseMax() * 0.80);
            }
            else if (this.getCharge() <= this.getPoids() / 2.0) {
                this.setVitesseMax(this.getVitesseMax() * 0.70);
            }
            else {
                this.setVitesseMax(4);
            }

        }
    }

    @Override
    public double vitesseMaximale() {
        return this.getVitesseMax();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", type : Brancardier" +
                ", charge : " + this.getCharge();
    }
}