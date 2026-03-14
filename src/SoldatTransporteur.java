public abstract class SoldatTransporteur extends Soldat {

    private int charge;

    public SoldatTransporteur(String nom, int poids, int charge) {
        super(nom, poids);
        this.charge = charge;
    }

    public int getCharge() {
        return this.charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public void prendreCharge(int charge) {
        this.setCharge(charge);
        this.mettreAJourVitesse();
    }

    public void decharger() {
        this.setCharge(0);
        this.mettreAJourVitesse();
    }

    public abstract void mettreAJourVitesse();

}