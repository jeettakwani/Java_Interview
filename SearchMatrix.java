package SortingAndSearching;

import java.util.Scanner;

/**
 * Created by jtakwani on 2/7/16.
 */
public class SearchMatrix {


    public String find(int[][] matrix, int value) {
        int row = 0;
        int column = matrix[0].length-1;
        while(row <= matrix.length-1 && column > 0) {
            if(matrix[row][column] == value)
                return(Integer.toString(row) + " " + Integer.toString(column));
            else if(matrix[row][column] > value)
                column--;
            else
                row++;
        }
        return ("not found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array row and column size");
        int row = sc.nextInt();
        int column = sc.nextInt();

        int[][] matrix = new int[row][column];

        System.out.println("Enter elements");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++)  {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter element");
        int value = sc.nextInt();

        SearchMatrix sm = new SearchMatrix();

        System.out.println("Element found at row and column: " + sm.find(matrix,value));
    }
}
