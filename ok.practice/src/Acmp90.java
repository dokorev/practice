// acmp.ru

import java.io.*;
import java.util.*;

public class Acmp90 {
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

    public static int area2(Point a, Point b, Point c) {
        return Math.abs(b.x - a.x) * (c.y - a.y) - (c.x - a.x) * (b.y - a.y);
    }

    public static void solve(Scanner in, PrintWriter out) {
        Point p = new Point(in);
        int n = in.nextInt();
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            Point p1 = new Point(in);
            Point p2 = new Point(in);
            Point p3 = new Point(in);
            int a12 = area2(p, p1, p3);
            int a23 = area2(p, p2, p3);
            int a31 = area2(p, p3, p1);
            if (area2(p1, p2, p3) == a12 + a23 + a31 && a12 > 0 && a23 > 0 && a31 > 0) {
                ans.add(i);
            }
        }
        out.println(ans.size());
        for (int i = 0; i < ans.size(); i++) {
            if (i > 0) {
                out.print(" ");
            }
            out.print(ans.get(i));
        }
    }
    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv

            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
