package calcolatrice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoreOperation calc = new CoreOperation();
        boolean running = true;

        System.out.println("--- Console Calculator ---");

        while (running) {
            System.out.println("\nChoose: 1) Add 2) Subtract 3) Multiply 4) Divide 0) Exit");
            int choice = scanner.nextInt();

            if (choice == 0) {
                running = false;
                System.out.println("Exiting calculator...");
                continue;
            }

            System.out.println("Last result in memory: " + calc.getResult());
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + calc.addition(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + calc.subtraction(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + calc.multiplication(num1, num2));
                    break;
                case 4:
                    System.out.println("Result: " + calc.division(num1, num2));
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }
}