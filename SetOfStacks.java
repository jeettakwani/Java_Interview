package StacksAndQueues;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by jtakwani on 2/6/16.
 */
public class SetOfStacks {

    ArrayList<Stack> setOfStack = new ArrayList<>();

    int top = -1;

    public void push(int n){
        Stack last = getLastStack();
        if(last != null)
            if(!last.isFull()) {
            last.push(n);
            return;
        }
        Stack s = new Stack(5);
        s.push(n);
        setOfStack.add(s);
    }

    public long pop() {
        Stack last = getLastStack();
        if(last != null )
            if(!last.isEmpty()) {
            return(last.pop());
        }
        if(last == null) {
            System.out.println("NO stacks");
            return -1;
        }
        else {
            setOfStack.remove(last);
            System.out.println("Last stack was empty removing it");
            return -1;
        }
    }

    public Stack getLastStack() {
        if(setOfStack.size() == 0)
            return null;
        return(setOfStack.get(setOfStack.size()-1));
    }

    public void popAtIndex(int index) {
        if(index == setOfStack.size()-1) {
            pop();
        }
        else
            removeAndShift(index);
    }

    public void removeAndShift(int index) {
        System.out.println(setOfStack.get(index).pop());
        for(int i = index; i < setOfStack.size(); i+=2) {
            long value = setOfStack.get(i+1).firstElement();
            setOfStack.get(i).push(value);
            long newValue = setOfStack.get(i+2).pop();
            setOfStack.get(i+1).pushFirstElement(newValue);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SetOfStacks s = new SetOfStacks();

        for(int i = 1; i < 41; i++) {
            s.push(i);
        }

        for(int i =0; i <11; i++) {
            System.out.println(s.pop());
        }

        System.out.println("Enter the stack number from which u want to delete");
        int index = sc.nextInt();
        s.popAtIndex(index);

    }

}
