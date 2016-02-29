package ArraysAndString;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by jtakwani on 2/1/16.
 */
public class PermutationOfStrings {

    public static void main(String[] args) throws IOException {
        String[] s = {"", "a", "b", "b", "abcdefg", "bcadefg", "abcdd", "abccd"};
        ArrayList<Boolean> result = new ArrayList<>();
        for(int i = 0; i < s.length; i+=2) {
            result.add(checkForPermutation(s[i],s[i+1]));
        }

        for(int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static boolean checkForPermutation(String s1, String s2) {

        if(s1.length() != s2.length())
            return false;

        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        java.util.Arrays.sort(charArray1);
        java.util.Arrays.sort(charArray2);

        for(int i = 0; i < charArray1.length; i++) {
            if(charArray1[i] != charArray2[i])
                return false;
        }
        return true;
    }
}
