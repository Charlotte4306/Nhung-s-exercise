package Exercise_1_1;

import edu.princeton.cs.algs4.StdDraw;

public class E31 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);
        StdDraw.setCanvasSize(600, 600);
        StdDraw.setScale(-1.2, 1.2);
        double radius = 1.0;
        double[] x = new double[N];
        double[] y = new double[N];
        for (int i = 0; i < N; i++) {
            double angle = 2 * Math.PI * i / N; // góc của điểm thứ i
            x[i] = radius * Math.cos(angle);    // chuyển tọa độ cực sang tọa độ Descartes O(x,y);
            y[i] = radius * Math.sin(angle);
            StdDraw.filledCircle(x[i], y[i], 0.05);
        }
        StdDraw.setPenColor(StdDraw. GRAY);
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (Math.random() < p) {
                    StdDraw.line(x[i], y[i], x[j], y[j]);
                }
            }
        }
    }
}
