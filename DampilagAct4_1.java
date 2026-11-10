import java.util.Scanner;

public class DampilagAct4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Rows: ");
        int rows = input.nextInt();

        System.out.print("Columns: ");
        int cols = input.nextInt();

        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= cols; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        input.close();
    }
}
