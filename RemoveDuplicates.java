package LinkedList;

import java.io.IOException;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by jtakwani on 2/2/16.
 */
public class RemoveDuplicates {

    public static void main(String[] args) throws IOException {

        LinkedList ll = new LinkedList();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Enter an element to be added to the list, please enter 0 when over");
            int i = sc.nextInt();
            if(i == 0)
                break;
            ll.add(i);
        }

        for(int i =0; i<ll.size();i++) {
            System.out.println(ll.get(i));
        }

        HashSet set = new HashSet();
        for(int i =0; i < ll.size(); i++) {
            if(set.contains(ll.get(i))) {
                ll.remove(i);
                continue;
            }
            else {
                set.add(ll.get(i));
            }
        }

        for(int i =0; i<ll.size();i++) {
            System.out.println(ll.get(i));
        }

    }
}
