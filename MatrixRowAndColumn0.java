package ArraysAndString;

import java.io.IOException;

/**
 * Created by jtakwani on 2/1/16.
 */
public class MatrixRowAndColumn0 {

    public static void main(String[] args) throws IOException {
        int[][] matrix = {{0,1,1},{1,1,0},{1,1,1},{0,1,1}};
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];

        for(int i = 0; i < matrix.length; i++) {
            for(int j =0; j < matrix[0].length;j++) {
                if(matrix[i][j] == 0) {
                    row[i] = true;
                    column[j]=true;
                }
            }
        }

        for(int i = 0; i < row.length; i++) {
            if (row[i]) {
                makeRowZero(i,matrix);
            }
        }

        for(int j = 0; j < column.length; j++) {
            if(column[j]) {
                makeColumnZero(j,matrix);
            }
        }

        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println("\n");
        }
    }

    public static void makeRowZero(int rowNum, int[][] matrix) {
        for(int i = 0; i < matrix[0].length; i++) {
            matrix[rowNum][i] = 0;
        }
    }

    public static void makeColumnZero(int columnNum, int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            matrix[i][columnNum] = 0;
        }
    }
}
