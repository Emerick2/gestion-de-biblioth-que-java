import java.util.List;
import java.util.ArrayList;

public class RetournerUnLivre {
    public static ArrayList<Livre> FenetreRetourDeLivre(ArrayList<Livre> listeLivre, Bibliotheque bibliotheque){
        System.out.println("Bienvenu dans votre interface pour rendre un livre !");
        if (!bibliotheque.Liste_de_livres_non_empruntable()) {
            return listeLivre;
        }

        System.out.println("");
        System.out.println("Écrivez l'identifiant du livre que vous souhaitez rendre.");
        int idChoisie = FaireUnChoix.NouveauChoix(1,listeLivre.size());
        return FaireRetournerUnLivre(listeLivre, idChoisie);
    }

    public static ArrayList<Livre> FaireRetournerUnLivre(ArrayList<Livre> listeLivre, int identifiantLivre){
        Livre leLivre = Bibliotheque.TrouverLeLivreParID(listeLivre, identifiantLivre);

        if (leLivre != null){
            if (!leLivre.isAvailable()){
                leLivre.setIsAvailable(true);
                System.out.println("Vous avez rendu le livre : "+leLivre.getTitre()+" écrit par "+leLivre.getAuteur()+".");
            } else {
                System.out.println("Vous n'avez pas emprunté se livre, désolé...");
            }
        } else {
            System.out.println("Le livre que vous cherchez n'est pas dans notre bibliothèque, désolé...");
        }
        return listeLivre;
    }
}
