package isika.magic;

// catégories de cartes :   - C pour créature
//                          - S pour sortilège
//                          - T pour terrain


public class Carte {
    int cout=0;
    char catCarte='';
    String nom="";
    String description="";


    public static Carte(int cout, char catCarte, String nom, String description){
        this.cout=cout;
        this.catCarte=catCarte;
        this.nom=nom;
        this.description=description;
    }

    public void afficher(){
    }




}
