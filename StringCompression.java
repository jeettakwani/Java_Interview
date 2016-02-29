package ArraysAndString;

import java.io.IOException;
import java.util.*;

/**
 * Created by jtakwani on 2/1/16.
 */
public class StringCompression {

    public static void main(String[] args) throws IOException {
        String[] s = {"","aaabcc","aabbccaa","abcd"};
        String[]s1 = {"aabbccaa"};
        ArrayList<String> result = new ArrayList<>();

        for(int i = 0; i < s.length; i++) {
            if(stringCompression(s[i]).length() == s[i].length())
                result.add(stringCompression(s[i]));
            else
                result.add(s[i]);
        }

        for(int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static String stringCompression(String s) {
        if(s.length() == 0 || s.length() == 1) {
            return s;
        }

        int count = 0;
        int j = 0;
        String compressed = "";
        for(int i = 0; i < s.length()&j < s.length();) {
            if(s.charAt(i) == s.charAt(j)) {
                j++;
                count++;
            }
            else {
                compressed = compressed+s.charAt(i)+count;
                i = j;
                count = 0;
            }
        }
        compressed = compressed+s.charAt(j-1)+count;
        return compressed;
    }
}
