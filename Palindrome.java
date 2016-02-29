import java.util.Scanner;

/**
 * Created by jtakwani on 11/24/15.
 */
public class Palindrome {

    public void palindrome() {
        System.out.println("Enter a number or a string --> 1. Number 2. String");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                int number = sc.nextInt();
                palindrome_of_number(number);
                break;
            case 2:
                String str = sc.next();
                palindrome_of_string(str);
        }
    }

    public void palindrome_of_number(int n) {
        String s = String.valueOf(n);
        palindrome_of_string(s);
    }
    public void palindrome_of_string(String s) {
        boolean flag = true;
        int j = s.length()-1;
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(j)) {
                flag = false;
                break;
            }
            j--;
        }
        System.out.println(flag);
    }
}
