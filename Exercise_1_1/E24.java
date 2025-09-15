package Exercise_1_1;

import java.util.Scanner;

public class E24 {
    public static int gcd(int p, int q)
    {
        if (q == 0) return p;
        System.out.println(p + " " + q);
        return gcd(q, p % q);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println(gcd(p, q));
    }
}
/* gcd(1111111,123456) = 1
1111111 123456
123456 7
7 4
4 3
3 1
1
 */