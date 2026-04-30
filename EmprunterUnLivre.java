import java.util.List;

public class EmprunterUnLivre {
    public static List<Livre> FaireEmprunterUnLivre(List<Livre> listeLivre, int identifiantLivre){
        for (Livre leLivre : listeLivre) {
            if (leLivre.identifiant == identifiant){
                if (!leLivre.livreEmprinter){
                    leLivre.livreEmprinter = false;
                    System.out.Println("Vous avez emprunter le livre : "+leLivre.titre+" écrit par "+leLivre.auteur);
                    return listeLivre;
                } else {
                    System.out.Println("Le livre que vous souhaitez emprunter est déjà emprunter, désolé...");
                    return listeLivre;
                }
            }
        }
        System.out.Println("Le livre que vous cherchez n'est pas dans notre bibliothèque, désolé...");
        return listeLivre;
    }
}