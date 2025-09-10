package Exercise_1_1;
import edu.princeton.cs.algs4.StdOut;

public class E7 {
    public static void question_a(){
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > .001) // Newton - Raphson
            t = (9.0/t + t) / 2.0;
        StdOut.printf("%.5f\n", t);
    }
    public static void question_b(){
        int sum = 0;
        for (int i = 1; i < 1000; i++) //O(n^2)
            for (int j = 0; j < i; j++)
                sum++;
        StdOut.println(sum);
    }
    public static void question_c(){
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2)
            for (int j = 0; j < 1000; j++)
                sum++;
        StdOut.println(sum);
    }
    public static void main(String[] args) {
        question_a(); // 3.00009
        question_b(); // 499500
        question_c(); // 10000
    }
}
