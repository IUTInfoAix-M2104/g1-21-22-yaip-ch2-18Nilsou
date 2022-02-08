package tp3;

public class Fractotial {
	   public static void main(String[] args) {  // Set an initial breakpoint at this statement
	      double n = 20;
	      double factorial = 1;

	      // n! = 1*2*3...*n
	      for (double i = 1; i <= n; ++i) {  // i = 1, 2, 3, ..., n
	         factorial = factorial * i;   // *
	      }
	      System.out.println("The Factorial of " + n + " is " + factorial);
	   }
	}