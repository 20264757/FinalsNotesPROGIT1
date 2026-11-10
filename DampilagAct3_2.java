import java.util.Scanner;

public class DampilagAct3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Start: ");
        int start = input.nextInt();

        System.out.print("End: ");
        int end = input.nextInt();

        int even = 0;
        int odd = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
                even++;
            } else {
                System.out.println(i + " is odd");
                odd++;
            }
        }

        System.out.println("Even: " + even + ", Odd: " + odd);

        input.close();
    }
}
