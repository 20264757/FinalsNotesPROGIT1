import java.util.Scanner;

public class DampilagAct2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice;
        double num1 = 0, num2 = 0, result;

        do {
            System.out.println("\n===== CALCULATOR =====");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("0. Exit");
            System.out.print("Choice: ");

            // Keep asking until the user types a whole number
            while (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number from 0 to 4.");
                input.next(); // throw away the bad input
                System.out.print("Choice: ");
            }
            choice = input.nextInt();
            input.nextLine(); // clear the leftover Enter key

            // Only ask for numbers when the choice is 1 to 4
            if (choice >= 1 && choice <= 4) {
                boolean valid = false;

                while (!valid) {
                    System.out.print("Enter two numbers: ");
                    String line = input.nextLine();

                    // Check the typed line using a second Scanner
                    Scanner lineScan = new Scanner(line);

                    if (lineScan.hasNextDouble()) {
                        num1 = lineScan.nextDouble();

                        if (lineScan.hasNextDouble()) {
                            num2 = lineScan.nextDouble();

                            if (lineScan.hasNext()) {
                                System.out.println("Invalid Choice");
                            } else {
                                valid = true; // exactly two valid numbers
                            }
                        } else if (lineScan.hasNext()) {
                            System.out.println("Invalid Choice");
                        } else {
                            System.out.println("Invalid Choice");
                        }
                    } else if (lineScan.hasNext()) {
                        System.out.println("Invalid Choice");
                    } else {
                        System.out.println("Invalid Choice");
                    }

                    lineScan.close();
                }
            }

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;

                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;

                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;

                case 4:
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero.");
                    } else {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    }
                    break;

                case 0:
                    System.out.println("Exiting calculator...");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose from 0 to 4.");
            }

        } while (choice != 0);

        input.close();
    }
}