public class RentreDansLeCercle {

    public static void exoV1(){
        // Declare variables
        double radius, diameter, circumference, area, surfaceArea, volume;  // inputs and results - all in double

        // Prompt and read inputs as "double"
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();  // read input as double
        in.close();

        // Compute in "double"
        area = Math.PI * radius * radius;
        circumference = 2.0 * Math.PI * radius;
        diameter = 2.0 * radius;
        surfaceArea = 4 * Math.PI * radius * radius;
        volume = 4 /3 * Math.PI * radius * radius * radius; 


        // Print results using printf() with the following format specifiers:
        //   %.2f for a double with 2 decimal digits
        //   %n for a newline

        System.out.printf("Diameter is: %.2f%n", diameter);
        System.out.printf("Diameter is: %.2f%n", circumference);
        System.out.printf("Diameter is: %.2f%n", area);
        System.out.printf("Diameter is: %.2f%n", surfaceArea);
        System.out.printf("Diameter is: %.2f%n", volume);
      
    }

    public static void exoV2(){
        
        // Declare variables
        double radius, diameter, surfaceArea, volume ,height, baseArea;  // inputs and results - all in double

        // Prompt and read inputs as "double"
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        radius = in.nextDouble();
        System.out.print("Enter the height : ");
        height = in.nextDouble();  // read input as double
        in.close();

        // Compute in "double"
        baseArea = Math.PI * radius * radius;
        surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
        volume = baseArea * height; 

        // Print results using printf() with the following format specifiers:
        //   %.2f for a double with 2 decimal digits
        //   %n for a newline

        System.out.printf("baseArea is: %.2f%n", baseArea);
        System.out.printf("surfaceArea is: %.2f%n", surfaceArea);
        System.out.printf("volume is: %.2f%n", volume);
      
    }

   public static void main(String[] args) {
        exoV1();
        exoV2();
    }
}
