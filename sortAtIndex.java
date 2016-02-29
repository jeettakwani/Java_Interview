import java.util.Scanner;

/**
 * Created by jtakwani on 11/25/15.
 */
public class sortAtIndex {

    public void sort(int numbers[]) {
        System.out.println("Enter the index");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        for(int i = 0; i < index; i++) {
            if (numbers[i] >= numbers[index]) {
                int temp = numbers[i];
                numbers[i] = numbers[index];
                numbers[index] = temp;
            }
        }
        for(int i = index; i < numbers.length; i++) {
            if (numbers[i] <= numbers[index]) {
                int temp = numbers[i];
                numbers[i] = numbers[index];
                numbers[index] = temp;
            }
        }
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
    }
}
