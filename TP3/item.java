import java.util.Scanner;



public class item{


    public static void main(java.lang.String[] args){


        int nbrItem;
        Scanner in = new Scanner(System.in);
        System.out.print("le nombre d'item : ");
        nbrItem = in.nextInt();

        int[] items;
        items = new int [nbrItem];

        String chaine;
        System.out.print("item separe d'un espace : ");
        for (int i = 0;i <= nbrItem-1; ++i){
            System.out.print("item : ");
            items[i]=in.nextInt();
        }
        in.close();
        
        for (int i = 0; i <= nbrItem-1; ++i ){
            System.out.print(items[i] + " - " );
        }

    }
}