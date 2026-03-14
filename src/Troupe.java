import java.util.ArrayList;

public class Troupe {

    private ArrayList<Soldat> soldats;

    public Troupe() {
        this.soldats = new ArrayList<Soldat>();
    }

    public void ajouterSoldat(Soldat soldat) {
        this.soldats.add(soldat);
    }

    public void enleverSoldat(Soldat soldat) {
        this.soldats.remove(soldat);
    }

    public double vitesseMaximaleConvoi() {
        double min = this.soldats.get(0).vitesseMaximale();

        for (int i = 1; i < this.soldats.size(); i++) {
            if (this.soldats.get(i).vitesseMaximale() < min) {
                min = this.soldats.get(i).vitesseMaximale();
            }
        }

        return min;
    }

    @Override
    public String toString() {
        return this.soldats.toString();
    }
}