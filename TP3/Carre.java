
import java.util.Scanner; 

public class Carre {


    public static void exoV2(){

        Scanner in = new Scanner(System.in);
        System.out.print("entre la taille d'un cote du carre : ");
        int taille = in.nextInt();
        in.close();
        int k;
        int i = 1;
        while(i<=taille){
            k=1;
            while(k<=taille){
                System.out.print("# ");
                ++k;
            }
            ++i;
            System.out.println(); 
        }

    }




   public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("entre la taille d'un cote du carre : ");
        int taille = in.nextInt();
        
        for (int i = 1 ; i <= taille ; ++i){
            for (int k = 1 ; k <= taille ; ++k){
                System.out.print("# ");
            }
            System.out.println(); 
        }

        exoV2();
        in.close();
   }
}