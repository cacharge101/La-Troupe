public class Lancement {

    public static void main(String[] args) {

        Troupe t = new Troupe();

        Soldat s1 = new SimpleSoldat("Alice", 80);
        Soldat s2 = new Brancardier("Bob", 90, 20);
        Soldat s3 = new Cavalier("Charles", 85, 70);

        t.ajouterSoldat(s1);
        t.ajouterSoldat(s2);
        t.ajouterSoldat(s3);

        System.out.println("La troupe : ");
        System.out.println(t);

        System.out.println("Vitesse maximale du convoi : " +
                t.vitesseMaximaleConvoi());

        t.enleverSoldat(s2);

        System.out.println("Après suppression d'un soldat : ");
        System.out.println(t);

        System.out.println("Nouvelle vitesse maximale du convoi : " +
                t.vitesseMaximaleConvoi());

    }

}