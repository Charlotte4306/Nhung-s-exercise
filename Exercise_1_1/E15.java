package Exercise_1_1;

import java.util.Scanner;

public class E15 {
    public static int[] histogram(int[] arr, int M) {
        int[] result = new int[M];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < M)
                result[arr[i]]++;
        }
        return result;
    }
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        printArr(histogram(arr, M));

    }
}
