package StacksAndQueues;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;

/**
 * Created by jtakwani on 2/3/16.
 */
public class Stack {

        private int maxSize;
        private long[] stackArray;
        private int top;
        public Stack(int s) {
            maxSize = s;
            stackArray = new long[maxSize];
            top = -1;
        }
        public void push(long j) {
            if(isFull()) {
                System.out.println("Stack full, cannot push " + j);
                return;
            }
            stackArray[++top] = j;
        }
        public long pop() {
            if(top == -1) {
                System.out.println("Stack empty");
                return -1;
            }
            return stackArray[top--];
        }
        public long peek() {
            if(top == -1) {
                //System.out.println("Stack empty");
                return -1;
            }
            return stackArray[top];
        }
        public boolean isEmpty() {
            return (top == -1);
        }
        public boolean isFull() {
            return (top == maxSize - 1);
        }

        public long firstElement() {
            if(isEmpty())
                return -1;
            return stackArray[0];
        }

        public void pushFirstElement(long v) {
            stackArray[0] = v;
        }

        public int stackize() {
            return top;
        }
}