package Exercise_1_1;

public class E12 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = 9 - i;
        for (int i = 0; i < 10; i++)
            a[i] = a[a[i]];
        for (int i = 0; i < 10; i++)
            System.out.println(i);
        // chỉ in ra i từ 0 đến 9 vì chỉ có một hàm println i
    }
}
