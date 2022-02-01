/**
 * Trying nested-if and switch-case statements.
 */
public class PrintNumberInWord {   // Save as "PrintNumberInWord.java"
   public static void main(String[] args) {
      int number = 1;  // Set the value of "number" here!
 
      // Using nested-if
      if (number == 1) {   // Use == for comparison
         System.out.println( " ben un t con ou quoi " );
      } else if ( number==1 ) {
        System.out.println( " un " );
      } else if ( number == 2 ) {
        System.out.println( " deux " );
      } else {
         System.out.println(" autre ");
      }

      System.out.println(" ------ ");
      // Using switch-case-default
      switch(number) {
         case 1: 
            System.out.println(" un ");
            break;  // Don't forget the "break" after each case!
         case 2: 
            System.out.println("deux");
            break;
         default: System.out.println(" autre "); 
      }
   }
}