import java.util.Scanner;

public class DampilagAct3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n (0 to 20): ");
        int n = input.nextInt();

        if (n < 0 || n > 20) {
            System.out.println("Invalid input. Please enter a number from 0 to 20.");
        } else {
            long factorial = 1;

            System.out.print(n + "! = ");

            if (n == 0) {
                System.out.println("1");
            } else {
                for (int i = n; i >= 1; i--) {
                    factorial *= i;

                    System.out.print(i);

                    if (i > 1) {
                        System.out.print(" x ");
                    }
                }

                System.out.println(" = " + factorial);
            }
        }

        input.close();
    }
}
