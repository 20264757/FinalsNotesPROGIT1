import java.util.Scanner;

public class DampilagAct5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char again;

        // Outer loop: one pass per game
        do {
            int secret = (int) (Math.random() * 100) + 1;   // 1 to 100
            int guess;
            int attempts = 0;

            // Bonus (uncomment to limit the player to 7 guesses):
            // final int MAX_GUESSES = 7;

            // Inner loop: keep guessing until correct
            do {
                System.out.print("Guess (1-100): ");
                guess = input.nextInt();

                // Reject out-of-range guesses; they do not count as attempts
                if (guess < 1 || guess > 100) {
                    System.out.println("Invalid guess! Enter a number from 1 to 100.");
                    continue;
                }

                attempts++;

                if (guess < secret) {
                    System.out.println("Too low!");
                } else if (guess > secret) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Correct! You got it in " + attempts + " guesses.");
                }

                 //Bonus (uncomment to test): MAX_GUESSES needs to be uncommented at the top
                 /*if (guess != secret && attempts == MAX_GUESSES) {
                     System.out.println("Out of guesses! The number was " + secret + ".");
                     break;
                 }*/

            } while (guess != secret);

            System.out.print("Play again? (Y/N): ");
            again = input.next().charAt(0);

        } while (again == 'Y' || again == 'y');

        System.out.println("Thanks for playing!");
        input.close();
    }
}