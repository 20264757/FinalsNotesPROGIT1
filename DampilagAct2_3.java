import java.util.Scanner;

public class DampilagAct2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int correctPIN = 1234;
        int pin;
        int attempts = 0;

        do {
            System.out.print("Enter PIN: ");
            pin = input.nextInt();

            attempts++;

            if (pin == correctPIN) {
                System.out.println("Access granted.");
            } else {
                if (attempts < 3) {
                    System.out.println("Wrong PIN. " + (3 - attempts) + " attempt(s) left.");
                }
            }

        } while (pin != correctPIN && attempts < 3);

        if (pin != correctPIN) {
            System.out.println("Account locked.");
        }

        input.close();
    }
}
