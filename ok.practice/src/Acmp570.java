// acmp.ru
//
// ACMP 570 with WA 11
// possible problem is
// 4 4
// *...
// .*..
// ..*.
// ...*
// SQUARE <-- should not be square as the original square cannot be 2x2

import java.io.*;
import java.util.*;

public class Acmp570 {
    // functions if needed
    // vvvvvvvvv

    public static int counter(char mm[][], int h, int w, int lb, int rb, int top, int bottom) {
        int count = 0;
        for (int r = top; r <= bottom; r++) {
            for (int c = lb; c <= rb; c++) {
                if (mm[r][c] == '*') {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean check(char mm[][], int h, int w, int lb, int rb, int top, int bottom) {
        if (rb - lb != bottom - top) {
            return false;
        }
        if (lb < 0 || top < 0) {
            return false;
        }
        if (rb >= w) {
            return false;
        }
        if (bottom >= h) {
            return false;
        }
        if (rb < lb) {
            return false;
        }
        int expected = (rb - lb + 1) * (rb - lb + 1);
        int actual = counter(mm, h, w, lb, rb, top, bottom);
        return expected == actual;
    }

    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int h = in.nextInt();
            int w = in.nextInt();
            in.nextLine();
            char mm[][] = new char[h][w];
            for (int i = 0; i < h; i++) {
                String r = in.nextLine();
                mm[i] = r.toCharArray();
            }
            // find boundaries
            int lb = w + 1;
            int rb = 0;
            int top = h + 1;
            int bot = 0;
            for (int r = 0; r < h; r++) {
                for (int c = 0; c < w; c++) {
                    if (mm[r][c] == '*') {
                        rb = Math.max(rb, c);
                        lb = Math.min(lb, c);
                        top = Math.min(top, r);
                        bot = Math.max(bot, r);
                    }
                }
            }
            // check all squares lb,lb+1,lb+2 * rb-2,rb-1,rb * top-2,top-1,top * bot,bot+1,bot+1
            boolean ans = false;
            for (int l = lb; l <= lb+2; l++) {
                for (int r = rb-2; r <= rb; r++) {
                    for (int t = top; t <= top+2; t++) {
                        for (int b = bot-2; b <= bot; b++) {
                            ans |= check(mm, h, w, l, r, t, b);
                        }
                    }
                }
            }
            if (ans) {
                out.println("SQUARE");
            } else {
                out.println("CIRCLE");
            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
