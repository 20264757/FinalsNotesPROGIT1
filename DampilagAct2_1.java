import java.util.Scanner;

public class DampilagAct2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age;
        int invalidAttempts = 0;

        do {
            System.out.print("Enter your age (1-120): ");
            age = input.nextInt();

            if (age < 1 || age > 120) {
                System.out.println("Invalid age. Try again.");
                invalidAttempts++;
            }

        } while (age < 1 || age > 120);

        System.out.println("Your age is " + age);
        System.out.println("Invalid attempts: " + invalidAttempts);

        input.close();
    }
}
