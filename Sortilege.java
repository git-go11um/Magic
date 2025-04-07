package isika.magic;

//Les sortilèges possèdent un nom et une explication sous forme de texte.

public class Sortilege extends carte{



    public static Sortilege(int cout, char catCarte, String nom, String description){
        super(cout, catCarte, nom, description);

    }

    public void afficher(){
        System.out.println(description);
    }



}
