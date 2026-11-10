import java.util.Scanner;

public class DampilagAct1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int count = input.nextInt();

        while (count >= 1) {
            System.out.print(count + " ");
            count--;
        }

        System.out.println("Liftoff!");

        input.close();
    }
}
