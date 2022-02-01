/**
 * Trying nested-if and switch-case statements.
 */
public class LesJoursdelaSemaineEnAnglais {   // Save as "PrintNumberInWord.java"
   public static void main(String[] args) {
        int number=2;
      switch(number) {
         case 1: 
            System.out.println("Saturday");
            break;  // Don't forget the "break" after each case!
         case 2: 
            System.out.println("Sunday");
            break;
         default: System.out.println(" Pffff c'est pas le Week-end  "); 
      }
   }
}