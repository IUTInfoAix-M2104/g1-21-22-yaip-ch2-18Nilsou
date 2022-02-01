public class Pi {   
   public static void exoV1() {
    double sum = 0.0;
      long MAX_DENOMINATOR = 1000000000;   // Try 10000, 100000, 1000000
      for (long denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
            // denominator = 1, 3, 5, 7, ..., MAX_DENOMINATOR
         if (denominator % 4 == 1) {
            sum += (1/(double)denominator);
         } else if (denominator % 4 == 3) {
            sum -= (1/(double)denominator);
         } else {   // remainder of 0 or 2
            System.out.println("Impossible!!!");
         }
      }
      sum = 4*sum;
      System.out.println(sum);
   }



   public static void main(String[] args) {
       exoV1();
       //exoV2(); // j'ai pas compris !!
   }
}