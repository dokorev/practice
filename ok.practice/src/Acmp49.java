// acmp.ru
//
// ACMP 570 with WA 11
// possible problem is
// 4 4
// * . . .
// . * . .
// . . * .
// . . . *
// SQUARE <-- should not be square as the original square cannot be 2x2

import java.io.*;
import java.util.*;

public class Acmp49 {
    // functions if needed
    // vvvvvvvvv
    public static boolean matches(char c, char tc) {
        if (tc == '?') {
            return true;
        } else if ('0' <= tc && tc <= '9') {
            return c == tc;
        } else if ('a' <= tc && tc <= 'g') {
            char min = (char) (tc - 'a' + '0');
            char max = (char) (min + 3);
            return min <= c && c <= max;
        } else {
            throw new Error();
        }
    }
    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            String t1 = in.next();
            String t2 = in.next();
            int p = 1;
            for (int i = 0; i < t1.length() || i < t2.length(); i++) {
                int count = 0;
                for (char c = '0'; c <= '9'; c++) {
                    if (matches(c, t1.charAt(i)) && matches(c, t2.charAt(i))) {
                        count++;
                    }
                }
                p *= count;
            }
            out.println(p);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
