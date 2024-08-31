import java.util.Scanner;

public class Operation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter 1st number: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Enter 2nd number: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Enter operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result;
        
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
                return;
        }
        
         System.out.printf("Result: %.2f\n", result);
    }
}
