import java.util.List;

public class Menu {
    public static Bibliotheque bibliotheque = new Bibliotheque(null, null);

    public static void main(String[] args) {
        Livre livre1 = new Livre("La voie de la main vide", "Romain");
        Livre livre2 = new Livre("Tout ça pour une virgule", "Félix");
        bibliotheque.addLivres(livre1);
        bibliotheque.addLivres(livre2);

        bibliotheque.ChangerListeLivre(EmprunterUnLivre.FaireEmprunterUnLivre(bibliotheque.getLivres(), bibliotheque.getLivres().get(0).getId()));
        bibliotheque.ChangerListeLivre(RetournerUnLivre.FaireRetournerUnLivre(bibliotheque.getLivres(), bibliotheque.getLivres().get(0).getId()));
    
        int valeur = FaireUnChoix.NouveauChoix(0,5);
        System.out.println(valeur+5);
    }
}