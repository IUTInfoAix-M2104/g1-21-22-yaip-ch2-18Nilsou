import java.util.Scanner;

public class Str {

    public static void main(java.lang.String[] args) {

        String chaine;

        Scanner clavier = new Scanner(System.in);
        System.out.print("un mot : ");
        chaine = clavier.next();
        clavier.close();
        int tailleChaine = chaine.length();

        for ( int i = tailleChaine-1; i >= 0;--i) {
            System.out.print(chaine.charAt(i));
        } 
    }
}