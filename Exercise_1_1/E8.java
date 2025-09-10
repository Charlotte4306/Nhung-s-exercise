package Exercise_1_1;

public class E8 {
    public static void main(String[] args) {
        System.out.println('b'); // b: in ra ký tự b kiểu char
        System.out.println('b' + 'c'); // 197: cộng hai char chuyển thành mã unicode int b = 98, c = 99 => b + c = 197
        System.out.println((char) ('a' + 4)); //e: a => mã unicode a = 97 + 4 = 101 sau đó ép kiểu dữ liệu (char) => kí tự e
    }
}
