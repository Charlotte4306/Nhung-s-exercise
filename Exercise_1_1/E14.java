package Exercise_1_1;

import java.util.Scanner;

public class E14 {
    public static int lg(int n){
        int i = 0;
        int res = 1;
        while(true){
            res *= 2;
            if(res > n) {
                res /= 2;
                break;
            }
            i++;
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(lg(n));
    }
}
