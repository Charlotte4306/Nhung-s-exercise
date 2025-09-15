package Exercise_1_1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;

public class E32 {
    public static void main(String[] args) {
        int  N = Integer.parseInt(args[0]);
        double l = Double.parseDouble(args[1]);
        double r = Double.parseDouble(args[2]);
        double[] input = {1.2, 3.4, 2.2, 5.1, 6.1, 11.4, 15.2};
        double thelta = (r-l)/N;
        int[] count = new int[1000];
        for(int i = 0; i < input.length; i++){
            int temp = (int)((input[i] - l)/thelta);
            count[temp]++;
        }
        StdDraw.setXscale(l - 1, r + 1);
        StdDraw.setYscale(-1,10);
        for(int i = 0; i < N; i++){
            double x = l + (i + 0.5)*thelta;
            double y = count[i] / 2.0;
            StdDraw.filledRectangle(x, y, thelta/2.0, count[i] / 2.0);
        }

    }
}
