import java.util.Scanner;

public class Bibliotheque {
    private String name;
    private Livre[] livres;

    public Bibliotheque(String name, Livre[] livres) {
        this.name = name;
        this.livres = livres;
    }

    public String getName() {
        return name;
    }

    public Livre[] getLivres() {
        return livres;
    }

    // public void Ajouter_livre(int id) {
    //     Scanner myObj = new Scanner(System.in);
    //     System.out.println("Entrez le titre du livre:");
    //     String title = myObj.nextLine();
    //     Livre livre = new Livre(title, id);
    //     for (int i = 0; i < livres.length; i++) {
    //         if (livres[i] == null) {
    //             livres[i] = livre;
    //             break;
    //         }
    //     }
    // }
    // public void Liste_de_livres() {
    //     for (int i = 0; i < livres.length; i++) {
    //         System.out.println(livres[i].getTitle());// + " of " + livres[i].getAuthor());
    //     }
    // }
}