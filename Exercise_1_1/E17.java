package Exercise_1_1;

public class E17 {
    public static String exR2(int n)
    {
        String s = exR2(n-3) + n + exR2(n-2) + n;
        if (n <= 0) return "";
        return s;
    }
    // lỗi gọi đệ quy trước điều kiện dừng => lặp vô hạn => StackOverflowError
    public static void main(String[] args) {
        System.out.println(exR2(3));
    }
}
