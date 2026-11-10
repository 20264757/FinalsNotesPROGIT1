//ORIGINAL CODE
/*import java.util.Scanner;

public class LastnameAct5_2 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int sum = 0;
       int i = 1;
       while (i < 5);
       {
           System.out.print("Enter number " + i + ": ");
           int num = input.nextInt();
           sum += num;
       }
       double avg = sum / 5;
       System.out.println("Average = " + avg);
   }
}*/
//FIXED CODE
import java.util.Scanner;

public class DampilagAct5_2 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int sum = 0;
       int i = 1;

       // Bug 1: "while (i < 5);" had a stray semicolon, which made the loop body
       //        an empty statement (the program hung forever). Removed the semicolon.
       // Bug 2: The condition "i < 5" only ran 4 times because i starts at 1.
       //        Changed it to "i <= 5" so it reads all 5 numbers.
       while (i <= 5)
       {
           System.out.print("Enter number " + i + ": ");
           int num = input.nextInt();
           sum += num;

           // Bug 3: i was never changed, so the loop could never end.
           //        Added i++ to move to the next number each pass.
           i++;
       }

       // Bug 4: "sum / 5" is integer division, so the decimal part was lost
       //        (e.g. 16 / 5 gave 3.0 instead of 3.2). Dividing by 5.0 makes it
       //        a double division.
       double avg = sum / 5.0;
       System.out.println("Average = " + avg);
   }
}