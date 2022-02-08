import java.util.Scanner;

public class bi {

    public static void main(java.lang.String[] args) {

        String chaine;

        Scanner clavier = new Scanner(System.in);
        System.out.print("un mot : ");
        chaine = clavier.next();
        clavier.close();
        int tailleChaine = chaine.length();
        
        boolean binaire = true;
        
        for ( int i = 0; i <= tailleChaine-1 ;++i) {
            if (!(chaine.charAt(i) == '0' || chaine.charAt(i) == '1')){
                binaire = false ;
                System.out.println("si tu vois ca ben c'est faux");
            }   
        }

        System.out.println("la chaine est binaire ... " + binaire);
    }
}