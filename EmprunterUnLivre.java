import java.util.List;
import java.util.ArrayList;

public class EmprunterUnLivre {
    public static ArrayList<Livre> FenetreEmpruntDeLivre(ArrayList<Livre> listeLivre, Bibliotheque bibliotheque){
        System.out.println("Bienvenu dans votre interface pour emprunter un livre !");
        bibliotheque.Liste_de_livres_empruntable();

        System.out.println("");
        System.out.println("Écrivez l'identifiant du livre que vous souhaitez emprunter.");
        int idChoisie = FaireUnChoix.NouveauChoix(1,listeLivre.size());
        return FaireEmprunterUnLivre(listeLivre, idChoisie);
    }


    public static ArrayList<Livre> FaireEmprunterUnLivre(ArrayList<Livre> listeLivre, int identifiantLivre){
        Livre leLivre = Bibliotheque.TrouverLeLivreParID(listeLivre, identifiantLivre);
        
        if (leLivre != null) {
            if (leLivre.isAvailable()){
                leLivre.setIsAvailable(false);
                System.out.println("Vous avez emprunter le livre : "+leLivre.getTitre()+" écrit par "+leLivre.getAuteur()+".");
            } else {
                System.out.println("Le livre que vous souhaitez emprunter est déjà emprunter, désolé...");
            }
        } else {
            System.out.println("Le livre que vous cherchez n'est pas dans notre bibliothèque, désolé...");
        }
        return listeLivre;
    }
}