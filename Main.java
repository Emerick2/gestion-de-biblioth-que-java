import java.util.List;

public class Main {
    public static Bibliotheque bibliotheque = new Bibliotheque(null, null);

    public static void main(String[] args) {
        Livre livre1 = new Livre("La voie de la main vide", "Romain");
        Livre livre2 = new Livre("Tout Ça Pour Une Virgule", "Félix");
        bibliotheque.addLivres(livre1);
        bibliotheque.addLivres(livre2);

        bibliotheque.ChangerListeLivre(EmprunterUnLivre.FenetreEmpruntDeLivre(bibliotheque.getLivres(), bibliotheque));
        bibliotheque.ChangerListeLivre(RetournerUnLivre.FenetreRetourDeLivre(bibliotheque.getLivres(), bibliotheque));
    
        // int valeur = FaireUnChoix.NouveauChoix(0,5);
        // System.out.println(valeur);

        // ChercherUnLivre.FenetreRecherche(bibliotheque.getLivres());
    }
}