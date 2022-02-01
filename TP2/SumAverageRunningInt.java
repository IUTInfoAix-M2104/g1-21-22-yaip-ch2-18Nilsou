/**
 * Compute the sum and average of running integers from a lowerbound to an upperbound using loop.
 */


public class SumAverageRunningInt {
    
    public static void exoV1() {
        // Define variables
      int sum = 0;          // The accumulated sum, init to 0
      double average;       // average in double
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 100;

      // Use a for-loop to sum from lowerbound to upperbound
      for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            // The loop index variable number = 1, 2, 3, ..., 99, 100
         sum += number;     // same as "sum = sum + number"
      }
      // Compute average in double. Beware that int / int produces int!
      average= (double)sum / 100;
      // Print sum and average
      System.out.println("la somme est : " + sum +" et la moy est : " + average);
    }
    
    public static void exoV2() {
        int sum = 0;          // The accumulated sum, init to 0
        double average;       // average in double
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        int cpt = LOWERBOUND;

        while (cpt<= UPPERBOUND){
            sum += cpt;
            ++cpt;
        }

        average= (double)sum / 100;
        System.out.println("la somme est : " + sum +" et la moy est : " + average);

    }


    public static void exoV3() {
        int sum = 0;          // The accumulated sum, init to 0
        double average;       // average in double
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        int cpt = LOWERBOUND;


        do {
            sum += cpt;
            ++cpt;
        } while (cpt<= UPPERBOUND) ;

        average= (double)sum / 100;
        System.out.println("la somme est : " + sum +" et la moy est : " + average);

    }

    public static void exoV4() {
        int sum = 0;          // The accumulated sum, init to 0
        double average;       // average in double
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        int cpt = LOWERBOUND;


        for ( int i = LOWERBOUND ; i <= UPPERBOUND ; ++i ){
            sum += cpt;
            ++cpt;
        }

        average= (double)sum / 100;
        System.out.println("la somme est : " + sum +" et la moy est : " + average);

    }

    public static void exoV5() {
        int sum = 0;          // The accumulated sum, init to 0
        double average;       // average in double
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        int cpt = LOWERBOUND;


        for ( int i = LOWERBOUND ; i <= UPPERBOUND ; ++i ){
            sum += cpt*cpt;
            ++cpt;
        }

        average= (double)sum / (100);
        System.out.println("la somme est : " + sum +" et la moy est : " + average);

    }

    public static void exoV6() {

        // Define variables
      int sumOdd  = 0;   // Accumulating sum of odd numbers
      int sumEven = 0;   // Accumulating sum of even numbers
      int absDiff;       // Absolute difference between the two sums
      final int valDebut=1;
      final int valFin=100;
      // Compute sums
      for (int number = valDebut; number<= valFin; ++number) {
         if (number%2==1) {
            sumOdd += number;
         } else {
            sumEven += number;
         }
      }
      // Compute Absolute Difference
      if (sumOdd > sumEven) {
         absDiff = sumOdd - sumEven ;
      } else {
         absDiff = sumEven - sumOdd;
      }
      // OR use one liner conditional expression
      absDiff = (sumOdd > sumEven) ? sumOdd : sumEven;
      System.out.println(absDiff);

    }
    
   public static void main (String[] args) {
      exoV1();
      System.out.println("----------");
      exoV2();
      System.out.println("----------");
      exoV3();
      System.out.println("----------");
      exoV4();
      System.out.println("----------");
      exoV5();
      System.out.println("----------");
      exoV6();
   }
}