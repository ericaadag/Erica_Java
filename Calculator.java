import java.util.Scanner;
public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }
 
    public double subtract(double a, double b) {
        return a - b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println ("invalid division");
            return Double.NaN;
        }
        return a / b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        int choice;
        double num1, num2, result;
        do {
            // Displaying of  menu
            System.out.println("Select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Division");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
            choice = scanner.nextInt();
            // Checking for exit condition
            if (choice == 4) {
                System.out.println("Exiting the calculator menu!");
                break;
            }
           
            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();
           
            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                    break;
                case 2:
                    result = calc.subtract(num1, num2);
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                    break;
                case 3:
                   
                        result = divide(num1, num2);
                        if (!Double.isNaN (result)){
                            System.out.println("Result: " + result);
                        }
                       
                   
                    break;
                    
                    

        }
        } while (true);
        scanner.close();
    }
}