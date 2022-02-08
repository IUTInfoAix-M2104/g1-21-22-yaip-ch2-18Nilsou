import java.util.Scanner;

public class hexa {

    public static void main(java.lang.String[] args) {

        String chaine;

        Scanner clavier = new Scanner(System.in);
        System.out.print("un mot : ");
        chaine = clavier.next();
        clavier.close();
        int tailleChaine = chaine.length();
        
        boolean binaire = true;
        
        for ( int i = 0; i <= tailleChaine-1 ;++i) {
            if (!((chaine.charAt(i) >= '0' && chaine.charAt(i) <= '9') || (chaine.charAt(i) >= 'A' && chaine.charAt(i) <= 'F') || (chaine.charAt(i) >= 'a' && chaine.charAt(i) <= 'f'))){
                binaire = false ;
                System.out.println("si tu vois ca ben c'est faux");
            }   
        }

        System.out.println("la chaine est hexa ... " + binaire);
    }
}