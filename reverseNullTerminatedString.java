package ArraysAndString;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.io.IOException;

/**
 * Created by jtakwani on 1/31/16.
 */
public class reverseNullTerminatedString {

    public static void main(String[] args) throws IOException {
        String[] s = {"abcdefg", "", "abcdd", "abccdefg", "ABCDEFGHIJKLMNOPQRSTUVWXYZ"};

        for(int i=0; i< s.length; i++) {
            if(s[i].length() == 0) {
                continue;
            }

            char[] charArray = s[i].toCharArray();
            int k = charArray.length-1;

            for(int j=0; j< charArray.length/2; j++) {
                System.out.println(charArray[j]);
                char temp = charArray[k];
                charArray[k] = charArray[j];
                charArray[j] = temp;
                k--;
            }
            s[i] = String.valueOf(charArray);
        }
        for(int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
