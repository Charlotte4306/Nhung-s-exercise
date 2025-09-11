package Exercise_1_1;
import edu.princeton.cs.algs4.StdOut;
import java.math.BigInteger;
public class E19 {
    public static long F(int N)
    {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N-1) + F(N-2);
    }
    // develop : O(n)
    // có thể chạy đúng đến n = 92, >92 thì bị tràn dữ liệu long dẫn tới sai kết quả
    public static long[] newFibo(int N) {
        long[] fibo = new long[N+1];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i <= N; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        return fibo;
    }
    // O(n), để lưu được các số Fibonacci rất lớn thì dùng class BigInteger trong java
    public static BigInteger[] newFibo2(int N) {
        BigInteger[] fibo2 = new BigInteger[N+1];
        fibo2[0] = BigInteger.ZERO;
        fibo2[1] = BigInteger.ONE;
        for (int i = 2; i <= N; i++) {
            fibo2[i] = fibo2[i-1].add(fibo2[i-2]);
        }
        return fibo2;
    }
    public static void main(String[] args)
    {
//       for (int N = 0; N < 100; N++)
//            StdOut.println(N + " " + F(N));

        BigInteger[] fibo = newFibo2(1000);
        for (int n = 0; n < 1000; n++) {
            StdOut.println(n + " " + fibo[n]);
        }
    }

    /* sau khi chạy chương trình thì sau khoảng 1-2p n = 49 và dừng lại ở đấy một lúc lâu
     nên giá trị lớn nhất của N để chương trình chạy ít hơn một giờ khoảng n = 49->55
    */
}
