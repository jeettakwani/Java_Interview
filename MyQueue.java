package StacksAndQueues;

import java.util.Scanner;

/**
 * Created by jtakwani on 2/6/16.
 */
public class MyQueue {

    public Stack newStack;
    public Stack oldStack;
    public int size;

    public MyQueue(int s) {
        newStack = new Stack(s);
        oldStack = new Stack(s);
        size = s;
    }

    public void add(long value) {
        newStack.push(value);
    }
    public long remove(){
        shiftStack();
        return oldStack.pop();
    }
    public long peek() {
        shiftStack();
        return oldStack.peek();
    }
    public void shiftStack() {
        if(oldStack.isEmpty()){
            while(!newStack.isEmpty()) {
                oldStack.push(newStack.pop());
            }
        }
    }

    public static void main(String[] args){
        MyQueue mq = new MyQueue(5);
        Scanner sc = new Scanner(System.in);
        System.out.println("Numbers");
        for(int i = 0; i < 5; i++) {
            mq.add(sc.nextLong());
        }
        System.out.println(mq.remove());
        System.out.println(mq.peek());
    }
}
