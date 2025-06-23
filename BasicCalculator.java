import java.util.Scanner;

public class BasicCalculator {

    // Arithmetic operation methods
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println(" Cannot divide by zero.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n Choose Operation: + - * / or 0 to exit");
            char option = sc.next().charAt(0);

            if (option == '0') {
                System.out.println(" Program terminated.");
                break;
            }

            double a = 0, b = 0;
			
            while(true)
			{
            
            try {
                System.out.print("Enter first number: ");
                a = sc.nextDouble();
                System.out.print("Enter second number: ");
                b = sc.nextDouble();
            } catch (Exception e) {
                System.out.println(" Invalid input. Please enter valid numbers.");
                sc.nextLine(); // clear buffer
                continue;
            }
			}
	
			

            double result;
		}
			
            switch (option) {
                case '+':
                    result = add(a, b);
                    System.out.println(" Result: " + result);
                    break;
                case '-':
                    result = subtract(a, b);
                    System.out.println(" Result: " + result);
                    break;
                case '*':
                    result = multiply(a, b);
                    System.out.println(" Result: " + result);
                    break;
                case '/':
                    result = divide(a, b);
                    if (!Double.isNaN(result)) {
                        System.out.println(" Result: " + result);
                    }
                    break;
                default:
                    System.out.println(" Invalid operator.");
            }
        }

        sc.close();
    }
}
