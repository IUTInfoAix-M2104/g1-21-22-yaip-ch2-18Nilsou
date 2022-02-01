public static void Swap2Integers(){
    int number1,number2,swap;
    Scanner in = new Scanner(System.in);  // Scan the keyboard
    System.out.print("Enter first integer: ");  // No newline for prompting message
    number1 = in.nextInt();                     // Read next input as "int"
    System.out.print("Enter second integer: ");  // No newline for prompting message
    number2 = in.nextInt();
    swap=number2;
    number2=number1;
    number1=swap;
    System.out.println("After the swap, first integer is: "+number1+", second integer is: "+number2);
 }