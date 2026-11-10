import java.util.Scanner;

public class DampilagAct3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.print("Enter upper limit: ");
        int limit = input.nextInt();

        for (int i = 1; i <= limit; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        input.close();
    }
}
