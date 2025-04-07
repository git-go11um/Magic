package isika.magic;

public class Jeu {
    int main=0;

    public static Jeu(int main){        
        this.main=main;
    }

    static void piocher(){
        main++;
        System.out.println("j'ai " + main + " carte.s en main.");
    }

    public void afficherMain(){
        System.out.println("j'ai " + main + " carte.s en main.");
	}

    public void joue(){
        main--;
        System.out.println("j'ai " + main + " carte.s en main.");
    }


}
