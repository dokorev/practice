// acmp.ru

import java.io.*;
import java.util.*;

public class Acmp348 {
    // functions if needed
    // vvvvvvvvv

    public static class Point {

        final int x;

        final int y;

        Point(Scanner in) {
            x = in.nextInt();
            y = in.nextInt();
        }
    }

    public static class Segment {

        final Point p1;

        final Point p2;

        Segment(Scanner in) {
            p1 = new Point(in);
            p2 = new Point(in);
        }

        public int vectorProduct(Point a, Point b, Point c) {
            return ((b.x - a.x) * (c.y - a.y) - (c.x - a.x) * (b.y - a.y));
        }

        public boolean oneLine(Point t1, Point t2) {
            return vectorProduct(p1, p2, t1) == 0 && vectorProduct(p1, p2, t2) == 0;
        }

        public boolean oneSide(Point t1, Point t2) {
            return 1L * vectorProduct(p1, p2, t1) * vectorProduct(p1, p2, t2) > 0;
        }
    }

    public static boolean haveCommonPoint(int a1, int a2, int b1, int b2) {
        return !(Math.max(a1, a2) < Math.min(b1, b2) || Math.max(b1, b2) < Math.min(a1, a2));
    }
    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            Segment s1 = new Segment(in);
            Segment s2 = new Segment(in);
            if (s1.oneLine(s2.p1, s2.p2)) {
                if (haveCommonPoint(s1.p1.x, s1.p2.x, s2.p1.x, s2.p2.x)
                        && haveCommonPoint(s1.p1.y, s1.p2.y, s2.p1.y, s2.p2.y)) {
                    out.println("Yes");
                } else {
                    out.println("No");
                }
            } else {
                if (s1.oneSide(s2.p1, s2.p2) || s2.oneSide(s1.p1, s1.p2)) {
                    out.println("No");
                } else {
                    out.println("Yes");
                }
            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
