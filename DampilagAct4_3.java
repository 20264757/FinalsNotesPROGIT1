public class DampilagAct4_3 {
    public static void main(String[] args) {

        /* Part A: break
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 && i % 9 == 0) {
                System.out.println("First number divisible by 7 and 9: " + i);
                break;
            }
        } */
        // Part B: continue
        for (int i = 1; i <= 20; i++) {
            if (i % 4 == 0) {
                continue;
            }

            System.out.print(i + " ");
        }

    }
}
