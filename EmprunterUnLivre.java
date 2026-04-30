import java.util.List;

public class EmprunterUnLivre {
    public static List<Livre> FenetreEmpruntDeLivre(List<Livre> listeLivre){
        System.out.println("Bienvenu dans votre interface pour emprunter un livre !");
        // System.out.println("Voici la liste des livre de notre bibliothèque :");
        // quand la fonction aurras été terminer il faudras écrire ici la liste des livre qui peuvent être emprunter.

        System.out.println("");
        System.out.println("Écrivez l'identifiant du livre que vous souhaitez emprunter.");
        int idChoisie = FaireUnChoix.NouveauChoix(1,listeLivre.size());
        return FaireEmprunterUnLivre(listeLivre, idChoisie);
    }


    public static List<Livre> FaireEmprunterUnLivre(List<Livre> listeLivre, int identifiantLivre){
        Livre leLivre = Bibliotheque.TrouverLeLivreParID(listeLivre, identifiantLivre);
        
        if (leLivre != null) {
            if (leLivre.IsAvailable()){
                leLivre.setIsAvailable(false);
                System.out.println("Vous avez emprunter le livre : "+leLivre.getTitle()+" écrit par "+leLivre.getAuthor()+".");
            } else {
                System.out.println("Le livre que vous souhaitez emprunter est déjà emprunter, désolé...");
            }
        } else {
            System.out.println("Le livre que vous cherchez n'est pas dans notre bibliothèque, désolé...");
        }
        return listeLivre;
    }
}