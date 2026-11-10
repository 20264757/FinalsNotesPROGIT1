import java.util.Scanner;

public class DampilagAct1_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int count = 0;
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;

            count++;
            rev = rev * 10 + digit;

            n = n / 10;
        }

        System.out.println("Digits: " + count);
        System.out.println("Reversed: " + rev);

        input.close();
    }
}
