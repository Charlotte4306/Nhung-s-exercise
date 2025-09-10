package Exercise_1_1;

import java.util.Scanner;

public class E9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        while(n !=0){
            s = (n % 2) + s;
            n /= 2;
        }
        // chuyển n thành xâu nhị phân, lấy modulo n với 2 cộng vào trước xâu s, rồi chia đến khi n = 0 thì dừng
        System.out.println(s);
    }
}
