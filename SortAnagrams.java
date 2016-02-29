package SortingAndSearching;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by jtakwani on 2/7/16.
 */
public class SortAnagrams {

    private Hashtable<String, LinkedList<String>> hash = new Hashtable<String, LinkedList<String>>();
    private String[] s;

    public void sortAnagrams() {
        for(String str: s) {
            String key = sortChars(str);
            if(!hash.containsKey(key)) {
                hash.put(key,new LinkedList<String>());
            }
            LinkedList<String> anagram = hash.get(key);
            anagram.push(str);
        }
    }

    public String sortChars(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public void hashSetToArray() {
        int index = 0;
        for(String keySet : hash.keySet()) {
            LinkedList<String> list = hash.get(keySet);
            for(String a : list) {
                s[index] = a;
                index++;
            }
        }
    }

    public void display() {
        for(int i = 0; i < s.length; i++) {
            System.out.print(s[i]+ " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();

        SortAnagrams sa = new SortAnagrams();
        sa.s = new String[size];

        System.out.println("Enter elements");
        for(int i = 0; i < size; i++) {
            sa.s[i] = sc.next();
        }

        sa.display();
        System.out.println("-----");
        sa.sortAnagrams();
        sa.hashSetToArray();
        sa.display();
    }
}
