package SortingAndSearching;

/**
 * Created by jtakwani on 2/7/16.
 */
public class MergeSortedArrays {
    int[] sortedA = {1,7,11,15,0,0,0};
    int[] sortedB = {3,8,12,16};

    int lastIndexOfA = sortedA.length - sortedB.length - 1;
    int lastIndexOfB = sortedB.length - 1;
    int mergeIndex = sortedA.length - 1;

    public void mergeSortedArrays() {
        while(lastIndexOfB >= 0) {
            if(sortedB[lastIndexOfB] >= sortedA[lastIndexOfA]) {
                sortedA[mergeIndex] = sortedB[lastIndexOfB];
                lastIndexOfB--;
            }
            else {
                sortedA[mergeIndex] = sortedA[lastIndexOfA];
                lastIndexOfA--;
            }
            mergeIndex--;
        }
    }

    public void display() {
        for(int i = 0; i < sortedA.length; i++)
            System.out.print(sortedA[i]+" ");
    }

    public static void main(String[] args) {
        MergeSortedArrays m = new MergeSortedArrays();
        m.mergeSortedArrays();
        m.display();
    }
}
