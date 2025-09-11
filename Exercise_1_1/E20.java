package Exercise_1_1;

import java.util.Scanner;

public class E20 {
    public static double ln(int n){
        if(n == 1)
            return 0;
        return Math.log(n) + ln(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ln(n));
    }
}
