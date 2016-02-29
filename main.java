import java.io.IOException;
import java.util.Scanner;

/**
 * Created by jtakwani on 11/24/15.
 */
public class main {

    public static void main(String args[]) throws IOException {
        System.out.println("\tProgramms");
        System.out.println("1) Reverse of a number");
        System.out.println("2) Palindrome");
        System.out.println("3) SortAtIndex\n");
        System.out.println("Enter the number corresponding to the algorithm you want to run:");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        switch(choice){
            case 1:ReverseOfNumber r = new ReverseOfNumber();
                r.reverse_of_number();
                break;
            case 2:Palindrome p = new Palindrome();
                p.palindrome();
                break;
            case 3: sortAtIndex s = new sortAtIndex();
                int[] a = {1,10,3,34,65,4,67,2};
                s.sort(a);
        }
    }
}
