// acmp.ru

import java.io.*;
import java.util.*;

public class Acmp344 {
    // functions if needed
    // vvvvvvvvv
    public static class Point {

        final int x;

        final int pos;

        Point(int x, int pos) {
            this.x = x;
            this.pos = pos;
        }
    }

    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            Point p[] = new Point[in.nextInt()];
            for (int i = 0; i < p.length; i++) {
                p[i] = new Point(in.nextInt(), i+1);
            }
            Arrays.sort(p, (left, right) -> left.x - right.x);
            int minDist = Integer.MAX_VALUE;
            int left = -1;
            int right = -1;
            for (int i = 0; i+1 < p.length; i++) {
                int dist = p[i + 1].x - p[i].x;
                if (dist < minDist) {
                    minDist = dist;
                    left = p[i].pos;
                    right = p[i + 1].pos;
                }
            }
            out.println(minDist);
            out.println(left + " " + right);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
