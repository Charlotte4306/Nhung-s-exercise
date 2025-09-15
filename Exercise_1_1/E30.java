package Exercise_1_1;

import java.util.Scanner;

public class E30 {
    public static boolean check(int a, int b){
        int res;
        while (b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        res = a;
        return (res == 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mRows = sc.nextInt();
        int nCols = sc.nextInt();
        boolean[][] arr = new boolean[mRows][nCols];
        for (int i = 0; i < mRows; i++) {
            for (int j = 0; j < nCols; j++) {
                arr[i][j] = check(i, j);
            }
        }
        for (int i = 0; i < nCols; i++) {
            for (int j = 0; j < mRows; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
