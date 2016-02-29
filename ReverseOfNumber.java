import java.util.Scanner;

/**
 * Created by jtakwani on 11/24/15.
 */
public class ReverseOfNumber {

    public void reverse_of_number() {
        System.out.println("Enter a integer number");
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        int number = sc.nextInt();
        if (number < 0) {
            number = number * -1;
            flag = true;
        }
        int remainder = 0;
        String s = "";

        while (number != 0) {
            remainder = number % 10;
            number = number / 10;
            s = s + String.valueOf(remainder);
        }
        if (!flag) {
            System.out.println("Reverse is: " + Integer.valueOf(s));
        } else {
            System.out.println("Reverse is: " + -1*Integer.valueOf(s));
        }
    }
}
