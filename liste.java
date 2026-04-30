import livre;
import bibliotheque;

public class Liste {
    public static void Liste_de_livres(String[] args) {
        for (int i = 0; i < livre.length; i++) {
            System.out.println(livre[i].getTitle() + " of " + livre[i].getAuthor());
        }
    }
}