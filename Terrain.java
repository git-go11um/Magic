package isika.magic;

//Les terrains possèdent une couleur (parmi 5 : blanc('B'), bleu ('b'), noir ('n'), rouge ('r') et vert ('v').)


public class Terrain extends carte{
    char couleur='a';

    public static Terrain(int cout, char catCarte, String nom, String description, char couleur){
        super(cout, catCarte, nom, description);
        this.couleur=couleur;

    }

    public void afficher(){
        System.out.println(description);
    }

}
