package Exercise_1_1;

public class E18 {
    public static int mystery(int a, int b)
    {
        if (b == 0)     return 0;
        if (b % 2 == 0) return mystery(a+a, b/2);
        return mystery(a+a, b/2) + a;
    }
    public static int mystery2(int a, int b)
    {
        if (b == 0)     return 1;
        if (b % 2 == 0) return mystery2(a*a, b/2);
        return mystery2(a*a, b/2) * a;
    }
    public static void main(String[] args) {
        System.out.println(mystery(2,25)); // 50
        System.out.println(mystery(3,11)); // 33
        System.out.println(mystery2(2,25)); // 33554432
        System.out.println(mystery2(3,11)); // 177147
    }
}
/* mystery(2,25)
L1: mystery(4, 12) + 2
L2: mystery(8,6)
L3: mystery(16,3)
L4: mystery(32,1) + 16
L5: mystery(64,0) + 32
mystery(64,0) = 0;
0 + 32 = 32
32 + 16 = 48
48 + 2 = 50
=> mystery(a,b) là a*b
a*0 = 0 => b = 0 return 0
b = 2k => a*b = a*2k = 2a*k = 2a*(b/2)
b = 2k + 1 => a*b = a*(2k+1) = 2a*(b/2) + a

binary multiplication algorithm( thuật toán nhân nhị phân)
25 = 11001 = 16 + 8 + 1


- đổi + thành *
=> mystery2(a,b) là a^b
binary exponentiation( lũy thừa nhị phân) (chia để trị?)
vd: mystery2(3,11)
L1: mystery2(9,5)*3 (3^1)
L2: mystery2(81,2)*9 (3^2)
L3: mystery2(6561,1)
L4: mystery2(...,0)*6561 = 1*6561 (3^8)

Hệ nhị phân 11 = 1011 = 2^3 + 2^2 + 2^1 = 8 + 2 + 1
3^11 = 3^8*3^2*3^1
 */
