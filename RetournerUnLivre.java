import java.util.List;
public class RetournerUnLivre {
    public static List<Livre> FaireRetournerUnLivre(List<Livre> listeLivre, int identifiantLivre){
        for (Livre leLivre : listeLivre) {
            if (leLivre.identifiant == identifiant){
                if (leLivre.livreEmprinter){
                    leLivre.livreEmprinter = false;
                    System.out.Println("Vous avez rendu le livre : "+leLivre.titre+" écrit par "+leLivre.auteur);
                    return listeLivre;
                } else {
                    System.out.Println("Vous n'avez pas emprunté se livre, désolé...");
                    return listeLivre;
                }
            }
        }
        System.out.Println("Le livre que vous cherchez n'est pas dans notre bibliothèque, désolé...");
        return listeLivre;
    }
}
