import java.util.Scanner; 
public class jesaisplus {  // Save as "Add2Integers.java"
    public static void main (String[] args) {     // Declare variables
        int number1, number2, number3, number4, number5;  // The 3 input integers
        int sum, product, min, max;     // To compute these
	  
        // Prompt and read inputs as "int"
        Scanner in = new Scanner(System.in);  // Scan the keyboard
        System.out.print("Enter first integer: ");  // No newline for prompting message
        number1 = in.nextInt();
        System.out.print("Enter first 2integer: ");  // No newline for prompting message
        number2 = in.nextInt();
        System.out.print("Enter first 3integer: ");  // No newline for prompting message
        number3 = in.nextInt();
        System.out.print("Enter first 4integer: ");  // No newline for prompting message
        number4 = in.nextInt();
        System.out.print("Enter first 5integer: ");  // No newline for prompting message
        number5 = in.nextInt();

        in.close();
	  
      // Compute sum and product
        sum = number1+number2+number3+number4+number5;
        product = number1*number2*number3+number4*number5;

      // Compute min
      // The "coding pattern" for computing min is:
      // 1. Set min to the first item
      // 2. Compare current min with the second item and update min if second item is smaller
      // 3. Repeat for the next item
        min = number1;        // Assume min is the 1st item
        if (number2 < min) {  // Check if the 2nd item is smaller than current min
        min = number2;     // Update min if so
        }
        if (number3 < min) {  // Continue for the next item
            min = number3;
        }
        if (number4 < min) {  // Continue for the next item
            min = number4;
        }
        if (number5 < min) {  // Continue for the next item
            min = number5;
        }
      
      // Compute max - similar to min
      max = number1;        // Assume min is the 1st item
        if (number2 > max) {  // Check if the 2nd item is smaller than current min
        max = number2;     // Update min if so
        }
        if (number3 > max) {  // Continue for the next item
            max = number3;
        }
        if (number4 > max) {  // Continue for the next item
            max = number4;
        }
        if (number5 > max) {  // Continue for the next item
            max = number5;
        }
      
      // Print results
        System.out.println(sum +" "+ product +" "+ min +" "+ max );

    
      
   }
}