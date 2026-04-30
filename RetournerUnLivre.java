import java.util.List;
public class RetournerUnLivre {
    public static List<Livre> FenetreRetourDeLivre(List<Livre> listeLivre, Bibliotheque bibliotheque){
        System.out.println("Bienvenu dans votre interface pour rendre un livre !");
        bibliotheque.Liste_de_livres_non_empruntable();

        System.out.println("");
        System.out.println("Écrivez l'identifiant du livre que vous souhaitez rendre.");
        int idChoisie = FaireUnChoix.NouveauChoix(1,listeLivre.size());
        return FaireRetournerUnLivre(listeLivre, idChoisie);
    }

    public static List<Livre> FaireRetournerUnLivre(List<Livre> listeLivre, int identifiantLivre){
        Livre leLivre = Bibliotheque.TrouverLeLivreParID(listeLivre, identifiantLivre);

        if (leLivre != null){
            if (!leLivre.IsAvailable()){
                leLivre.setIsAvailable(true);
                System.out.println("Vous avez rendu le livre : "+leLivre.getTitle()+" écrit par "+leLivre.getAuthor()+".");
            } else {
                System.out.println("Vous n'avez pas emprunté se livre, désolé...");
            }
        } else {
            System.out.println("Le livre que vous cherchez n'est pas dans notre bibliothèque, désolé...");
        }
        return listeLivre;
    }
}
