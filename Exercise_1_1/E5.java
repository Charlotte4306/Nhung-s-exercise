package Exercise_1_1;

import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if(x >= 0 && x <= 1 && y >= 0 && y <= 1) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
