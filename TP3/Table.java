public class Table{

        public static void main (String[] args){

            System.out.print("* |");
            for (int i = 1; i<=10; ++i){
                System.out.printf("%4d",i);
            }
            System.out.println();
            int p;
            for (int i = 1; i<=10;++i){
                System.out.print(i+" |");
                for (int k = 1; k<=10; ++k){
                    p=k*i;
                    System.out.printf("%4d",p);
                }
                System.out.println();
            }
        }
}