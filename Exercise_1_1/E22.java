package Exercise_1_1;

import java.util.Scanner;

public class E22 {
    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1,0);
    }
    String dept = "";
    public static int rank(int key, int[] a, int lo, int hi, int i) {
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;

        if(i != 0)
            for(int j = 0; j < i; j++)
                System.out.print("  ");
        System.out.println("lo = " + lo + ", hi = " + hi);
        i++;
        if (key < a[mid]) {
            return rank(key, a, lo, mid - 1,i);
        } else if (key > a[mid]) {
            return rank(key, a, mid + 1, hi,i);
        } else return mid;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(rank(7, arr));
    }
}
