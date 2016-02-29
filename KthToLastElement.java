package LinkedList;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by jtakwani on 2/2/16.
 */
public class KthToLastElement {

    public static void main (String[] args)throws IOException {
        LinkedList ll = new LinkedList();
        Scanner sc = new Scanner(System.in);

        int k;
        System.out.println("Enter value of k");
        k = sc.nextInt();
        while(true) {
            System.out.println("Enter an element to be added to the list, please enter 0 when over");
            int i = sc.nextInt();
            if(i == 0)
                break;
            ll.add(i);
        }

        for(int i =0; i<ll.size();i++) {
            System.out.print(ll.get(i)+ " ");
        }

        System.out.print("\n");

        for(int i = 0; i < k; i++) {
            ll.removeFirst();
        }

        for(int i =0; i<ll.size();i++) {
            System.out.print(ll.get(i) + " ");
        }
    }
}
