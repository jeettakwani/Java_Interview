package StacksAndQueues;

import java.util.Scanner;

/**
 * Created by jtakwani on 2/6/16.
 */
public class SortStack {

    public Stack original;
    public Stack sorted;
    public int size;

    public SortStack(int s) {
        original= new Stack(s);
        sorted = new Stack(s);
        size = s;
    }

    public void addNumbers() {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < size; i++) {
            original.push(sc.nextLong());
        }
    }

    public void sortStack() {
        while(!original.isEmpty()) {
            long value = original.pop();
            if(sorted.isEmpty())
                sorted.push(value);
            else {
                while(sorted.peek() >= value) {
                    original.push(sorted.pop());
                }
                sorted.push(value);
                while(sorted.peek() <= original.peek()) {
                    sorted.push(original.pop());
                }
            }
        }
    }

    public void displaySorted() {
        for(int i = 0; i < size; i++) {
            System.out.println(sorted.pop());
        }
    }

    public static void main(String[] args) {
        SortStack s = new SortStack(7);
        System.out.println("Enter the numbers");
        s.addNumbers();
        s.sortStack();
        s.displaySorted();
    }
}
