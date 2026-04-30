# Le gestionnaire de bibliothèque
> Réaliser par Ewen, Émerick, Kilian, Yves

### À quoi sert notre gestionnaire de bibliothèque ?
Il s'agis d'un outils réaliser en `Java` permettant d'emprunter et de rendre des livre dans notre bibliothèque. L'utilisateur aura également la possibilité de rechercher un livre grâce à son auteur ou à son titre mais aussi la possibilité de voir tous les livre ranger dans notre bibliothèque.

# La structure de notre projet :
```
┌── Main.java               # Cette classe permet de démarrer notre outils.
├── Livre.java              # Cette classe est la classe des livres. Elle est très utilisée dans les divers autres programmes de cet outil.
├── Bibliotheque.java       # Cette classe permet de voir la liste des livres pressants dans notre bibliothèque. Il y a aussi plusieurs autres fonction utilitaire du projet qui sont pressante ici.
├── ChercherUnLivre.java    # Cette classe permet à notre utilisateur de réaliser une recherche dans la liste de livre.
├── EmprunterUnLivre.java   # Cela permet d'emprunter l'un des livres de la bibliothèque.
├── RetournerUnLivre.java   # Cela permet de rendre l'un des livres de la bibliothèque.
└── FaireUnChoix.java       # Il s'agit d'une classe qui sera utilisé par les autres classe pour demander à l'utilisateur d'écrire un nombre compris entre deux valeur défini.
```

# Comment démarrer le projet ?
```
javac Livre.java Menu.java EmprunterUnLivre.java RetournerUnLivre.java Bibliotheque.java FaireUnChoix.java 

java Main.java
```
