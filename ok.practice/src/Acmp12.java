// acmp.ru

import java.io.*;
import java.util.*;

public class Acmp12 {
    // functions if needed
    // vvvvvvvvv

    public static class Point {

        final long x;

        final long y;

        Point(Scanner in) {
            x = in.nextInt();
            y = in.nextInt();
        }
    }

    public static long area2(Point a, Point b, Point c) {
        return Math.abs((b.x - a.x) * (c.y - a.y) - (b.y - a.y) * (c.x - a.x));
    }

    public static boolean belongs(Point p, Point p1, Point p2, Point p3) {
        return area2(p1, p2, p3) == area2(p, p1, p2) + area2(p, p2, p3) + area2(p, p3, p1);
    }
    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int n = in.nextInt();
            int count = 0;
            for (int i = 0; i < n; i++) {
                Point p = new Point(in);
                Point p1 = new Point(in);
                Point p2 = new Point(in);
                Point p3 = new Point(in);
                Point p4 = new Point(in);
                if (belongs(p, p1, p2, p3) || belongs(p, p1, p3, p4)) {
                    count++;
                }
            }
            out.println(count);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
