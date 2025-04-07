package isika.magic;

//Les créatures possèdent un nom, un nombre de points de dégâts et un nombre de points de vie.


public class Creature extends carte{
    int ptDegat=0;
    int pv=0;

    public static Creature(int cout, char catCarte, String nom, String description, int ptDegat, int pv){
        super(cout, catCarte, nom, description);
        this.ptDegat=ptDegat;
        this.pv=pv;
    }

    public void afficher(){
        System.out.println(description);
	}




}
