package Exercise_1_1;

import java.util.Random;
import java.util.Scanner;

public class E11 {
    public static boolean[][] initialize(){
        Scanner sc = new Scanner(System.in);
        int mRows = sc.nextInt();
        int nCols = sc.nextInt();
        Random rand = new Random();
        boolean[][] arr = new boolean[mRows][nCols];
        for(int i = 0; i < mRows; i++){
            for(int j = 0; j < nCols; j++){
                arr[i][j] = rand.nextBoolean();
            }
        }
        return arr;
    }
    public static void main(String[] args){
        boolean[][] barr = initialize();
        for(int i = 0; i < barr.length; i++){
            for(int j = 0; j < barr[i].length; j++){
                //System.out.print(barr[i][j] + " ");
                if(barr[i][j]){
                    System.out.print('*');
                }
                else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
