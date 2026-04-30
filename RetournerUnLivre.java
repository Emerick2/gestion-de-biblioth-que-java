import java.util.List;
public class RetournerUnLivre {
    public static List<Livre> FaireRetournerUnLivre(List<Livre> listeLivre, int identifiantLivre){
        for (Livre leLivre : listeLivre) {
            if (leLivre.getId() == identifiantLivre){
                if (!leLivre.IsAvailable()){
                    leLivre.setIsAvailable(true);
                    System.out.println("Vous avez rendu le livre : "+leLivre.getTitle()+" écrit par "+leLivre.getAuthor()+".");
                    return listeLivre;
                } else {
                    System.out.println("Vous n'avez pas emprunté se livre, désolé...");
                    return listeLivre;
                }
            }
        }
        System.out.println("Le livre que vous cherchez n'est pas dans notre bibliothèque, désolé...");
        return listeLivre;
    }
}
