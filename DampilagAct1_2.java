import java.util.Scanner;

public class DampilagAct1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        int counter = 1;
        int sum = 0;

        while (counter <= n) {
            sum += counter;
            counter++;
        }

        System.out.println("Sum of 1 to " + n + " = " + sum);

        input.close();
    }
}
