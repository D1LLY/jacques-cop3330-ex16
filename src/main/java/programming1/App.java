/*
Example Output
What is your age? 15
You are not old enough to legally drive.
Or

What is your age? 35
You are old enough to legally drive.
Constraints
Use a single output statement.

 */

package programming1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final int  drivingAge=16;

        Scanner in=new Scanner(System.in);

        System.out.print("What is your age? ");
        int age=in.nextInt();

        String out= age>=drivingAge ? "You are old enough to legally drive.":"You are not old enough to legally drive.";
        System.out.println(out);
    }

}
