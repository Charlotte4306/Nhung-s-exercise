package Exercise_1_1;

import java.util.Scanner;

public class E13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mRows = sc.nextInt();
        int nCols = sc.nextInt();
        int [][] arr = new int[mRows][nCols];
        int [][] barr = new int[nCols][mRows];
        for(int i = 0; i < mRows; i ++){
            for(int j = 0; j < nCols; j ++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int j = 0; j < nCols; j ++){
            for(int i = 0; i < mRows; i++){
                barr[j][i] = arr[i][j];
            }
        }
        for(int i = 0; i < barr.length; i++){
            for(int j = 0; j < barr[i].length; j++) {
                System.out.print(barr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
