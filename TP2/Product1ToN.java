
import java.util.Scanner;

public class Product1ToN {
   public static void main(String[] args) {
        int n;
        Scanner clavier = new Scanner(System.in);
        System.out.print("Saisir un n : ");
        n = clavier.nextInt();
        int prod=1;
        clavier.close();

        for (int number = 1 ; number <= n ; ++number ){
            prod *= number;
        }

        System.out.println(prod);
    }
}