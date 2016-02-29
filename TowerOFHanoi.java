package StacksAndQueues;

import java.util.Scanner;

/**
 * Created by jtakwani on 2/6/16.
 */
public class TowerOFHanoi {

    public Stack tower1;
    public Stack tower2;
    public Stack tower3;
    public int size = 0;
    public TowerOFHanoi(int s) {
        tower1 = new Stack(s);
        tower2 = new Stack(s);
        tower3 = new Stack(s);
        size = s;
    }

    public void addDisks() {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < size; i++) {
            tower1.push(sc.nextLong());
        }
    }

    public void move(int s) {
        if(s > 0) {
            moveDisks(s,tower1,tower3,tower2);
        }
    }

    public void moveDisks(int s, Stack origin, Stack destination, Stack buffer) {
        if (s>0) {
            moveDisks(s-1,origin,buffer,destination);
            moveToTop(origin,destination);
            moveDisks(s-1,buffer,destination,origin);
        }
    }

    public void moveToTop(Stack origin, Stack destination) {
        long value = origin.pop();
        destination.push(value);
    }


    public void displayFinal() {
        System.out.println("---Final---");
        for(int i = 0; i < size; i++){
            System.out.println(tower3.pop());
        }
    }

    public static void main(String[] args) {
        TowerOFHanoi t = new TowerOFHanoi(5);
        System.out.println("Add disks");
        t.addDisks();
        t.move(5);
        t.displayFinal();
    }
}
