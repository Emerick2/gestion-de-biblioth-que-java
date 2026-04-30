import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class ChercherUnLivre {
    public static String FormatNom(String nom){
        if (nom == null) return "";
        nom = nom.toLowerCase();
        nom = nom.replace(" ", "");
        nom = nom.replace("é", "e");
        nom = nom.replace("è", "e");
        nom = nom.replace("ê", "e");
        nom = nom.replace("ë", "e");
        nom = nom.replace("ù", "u");
        nom = nom.replace("û", "u");
        nom = nom.replace("ü", "u");
        nom = nom.replace("à", "a");
        nom = nom.replace("ä", "a");
        nom = nom.replace("â", "a");
        nom = nom.replace("ï", "i");
        nom = nom.replace("ì", "i");
        nom = nom.replace("î", "i");
        nom = nom.replace("ö", "o");
        nom = nom.replace("ò", "o");
        nom = nom.replace("ô", "o");
        nom = nom.replace("ç", "c");
        return nom;
    }

    public static void FenetreRecherche(ArrayList<Livre> listeLivre){
        System.out.println("");
        System.out.println("Bienvenu dans votre interface de recherche !");
        System.out.println("Que shouaitez vous faire ?");
        System.out.println("1 | Faire une recherche par nom de livre.");
        System.out.println("2 | Faire une recherche par nom d'auteur.");
        int réponse = FaireUnChoix.NouveauChoix(1, 2);

        System.out.println("");
        System.out.println("Que shouaite tu rechercher ?");
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        switch (réponse) {
            case 1:
                FaireUneRechercheDeLivreParTitre(listeLivre, str);
                break;
        
            default:
                FaireUneRechercheDeLivreParAuteur(listeLivre, str);
                break;
        }
        System.out.println("");
        
    }

    public static void FaireUneRechercheDeLivreParTitre(ArrayList<Livre> listeLivre, String recherche){
        Boolean unLivreOuPlusTrouver = false;
        recherche = FormatNom(recherche);
        System.out.println(recherche);
        for (Livre leLivre : listeLivre) {
            if (leLivre != null){
                String nomDuLivre = FormatNom(leLivre.getTitre());
                if (nomDuLivre.equals(recherche)){
                    if (!unLivreOuPlusTrouver) System.out.println("Voici la liste des livre qui correspondent à votre recherche :");
                    leLivre.ToString();
                    unLivreOuPlusTrouver = true;
                }
            }
        }
        if (!unLivreOuPlusTrouver) System.out.println("Aucun livre ne correspond à votre demande");
    }


    public static void FaireUneRechercheDeLivreParAuteur(ArrayList<Livre> listeLivre, String recherche){
        Boolean unLivreOuPlusTrouver = false;
        recherche = FormatNom(recherche);
        for (Livre leLivre : listeLivre) {
            if (leLivre != null){
                String nomDuLivre = FormatNom(leLivre.getTitre());
                if (nomDuLivre.equals(recherche)){
                    if (!unLivreOuPlusTrouver) System.out.println("Voici la liste des livre qui correspondent à votre recherche :");
                    leLivre.ToString();
                    unLivreOuPlusTrouver = true;
                }
            }
        }
        if (!unLivreOuPlusTrouver) System.out.println("Aucun livre ne correspond à votre demande");
    }
}
