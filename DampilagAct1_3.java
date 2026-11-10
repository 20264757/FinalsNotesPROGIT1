import java.util.Scanner;

public class DampilagAct1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int total = 0;

        System.out.print("Enter score (-1 to stop): ");
        int score = input.nextInt();

        while (score != -1) {
            total += score;
            count++;

            System.out.print("Enter score (-1 to stop): ");
            score = input.nextInt();
        }

        if (count > 0) {
            double average = (double) total / count;

            System.out.println("Scores entered: " + count);
            System.out.println("Total: " + total);
            System.out.println("Average: " + average);
        } else {
            System.out.println("No scores entered.");
        }

        input.close();
    }
}
