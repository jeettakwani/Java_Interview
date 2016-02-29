package ArraysAndString;

import java.io.IOException;

/**
 * Created by jtakwani on 1/31/16.
 */
public class StringHasUniqueCharacters {

    public static void main(String[] args) throws IOException {
        String[] s= {"abcdefg", "", "abcdd", "abccdefg", "ABCDEFGHIJKLMNOPQRSTUVWXYZ"};
        boolean[] res = new boolean[s.length];
        for(int i = 0; i< s.length; i++) {
            boolean[] result = new boolean[256];
            if(s[i].length() == 0) {
                res[i] = true;
                continue;
            }
            for(int j=0; j< s[i].length(); j++) {
                if(result[s[i].charAt(j)]) {
                    res[i] = false;
                    break;
                }
                else {
                    res[i] = true;
                    result[s[i].charAt(j)] = true;
                }
            }
        }
        for(int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
