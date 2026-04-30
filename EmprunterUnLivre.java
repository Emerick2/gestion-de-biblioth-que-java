import java.util.List;

public class EmprunterUnLivre {
    public static List<Livre> FaireEmprunterUnLivre(List<Livre> listeLivre, int identifiantLivre){
        for (Livre leLivre : listeLivre) {
            if (leLivre != null){
                if (leLivre.getId() == identifiantLivre){
                    if (leLivre.IsAvailable()){
                        leLivre.setIsAvailable(false);
                        System.out.println("Vous avez emprunter le livre : "+leLivre.getTitle()+" écrit par "+leLivre.getAuthor()+".");
                        return listeLivre;
                    } else {
                        System.out.println("Le livre que vous souhaitez emprunter est déjà emprunter, désolé...");
                        return listeLivre;
                    }
                }
            }
        }
        System.out.println("Le livre que vous cherchez n'est pas dans notre bibliothèque, désolé...");
        return listeLivre;
    }
}