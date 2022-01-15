// acmp.ru

import java.io.*;
import java.util.*;

public class Acmp102 {
    // functions if needed
    // vvvvvvvvv
    public static int area2(int x1, int y1, int x2, int y2, int x3, int y3) {
        return Math.abs((x2-x1) * (y3-y1) - (x3-x1) * (y2-y1));
    }
    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();
            int x3 = in.nextInt();
            int y3 = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            int s = area2(x1, y1, x2, y2, x3, y3);
            int s12 = area2(x, y, x1, y1, x2, y2);
            int s23 = area2(x, y, x2, y2, x3, y3);
            int s13 = area2(x, y, x1, y1, x3, y3);
            if (s == s12 + s23 + s13) {
                out.println("In");
            }
            else {
                out.println("Out");
            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
