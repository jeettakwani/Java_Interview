package ArraysAndString;

/**
 * Created by jtakwani on 2/9/16.
 * for interview
 */
public class ReverseWords {
    public String reverseWords(String a) {
        int left = 0;
        int right = a.length()-1;
        char[] charArray = a.toCharArray();
        if(right >1)
        {
            charArray = reverseCharArray(charArray,left,right);

            for(right = 0; right <= charArray.length; right++)
            {
                if(right == charArray.length|| charArray[right] == ' ') {
                    charArray = reverseCharArray(charArray,left,right-1);
                    left = right+1;
                }
            }
        }
        return removeExtraSpaces(charArray);
    }

    public char[] reverseCharArray(char[] charArray, int left, int right)
    {
        char tempc;
        if(charArray[left] == ' ')
            left++;
        while(left < right)
        {
            tempc = charArray[left];
            charArray[left++] = charArray[right];
            charArray[right--] = tempc;
        }
        return charArray;
    }

    public String removeExtraSpaces(char [] array) {
        int n = array.length;
        int index = 0;
        boolean cond = false;

        for (int i = 0; i < n; ) {

            if (array[i] != ' ') {
                array[index] = array[i];
                index++;
                cond = true;
            } else {
                if (cond)
                    array[index++] = ' ';
                cond = false;
            }

            i++;
        }
        if (index - 1 >= 0 && index - 1 < n && array[index - 1] == ' ')
            index--;

        return new String(array, 0, index);
    }

    public static void main(String[] args) {
        String str = "hriya is stupid only";

        ReverseWords r = new ReverseWords();
        System.out.println(r.reverseWords(str));
    }
}
