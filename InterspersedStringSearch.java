package SortingAndSearching;

import java.util.Scanner;

/**
 * Created by jtakwani on 2/7/16.
 */
public class InterspersedStringSearch {

    private String[] string = {"at","","","","ball","","","cat","","","dad","",""};
    int left,right,mid;

    public int find(String value) {
        int length = string.length-1;
        left = 0;
        right = length;
        //mid = left+right/2;
        return searchString(string,value,left,right);
    }

    public int searchString(String[] string, String value, int left, int right) {
        if(left > right) {
            return -1;
        }
        mid = left+right/2;

        if(string[mid].equals("")) {
            int first = mid-1;
            int last = mid+1;
            while(true) {
                if(first < left && last > right)
                    return -1;
                else if(first >= left && !string[first].isEmpty()){
                    mid = first;
                    break;
                }
                else if(last <= right && !string[last].isEmpty()) {
                    mid = last;
                    break;
                }
                else {
                    first--;
                    last++;
                }
            }
        }



        if(value.equals(string[mid]))
            return mid;
        else if(value.compareTo(string[mid]) < 0)
            return searchString(string,value,left,mid-1);
        else
            return searchString(string,value,mid+1,right);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();

        /*String[] s = new String[size];

        System.out.println("Enter elements");
        for(int i = 0; i < size; i++) {
            s[i] = sc.next();
        }*/

        System.out.println("Enter elements");
        String value = sc.next();

        InterspersedStringSearch iss = new InterspersedStringSearch();

        System.out.println("String found at: " + iss.find(value));
    }
}
