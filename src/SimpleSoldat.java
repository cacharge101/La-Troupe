public class SimpleSoldat extends Soldat {

    public SimpleSoldat(String nom, int poids) {
        super(nom, poids);
        this.setVitesseMax(vitesseMaximale());
    }

    @Override
    public double vitesseMaximale() {

        if (this.getPoids() < 85) {
            return 7;
        }
        else if (this.getPoids() <= 95) {
            return 6.6;
        }
        else {
            return 6;
        }

    }

    @Override
    public String toString() {
        return super.toString() +
                ", type : SimpleSoldat";
    }
}