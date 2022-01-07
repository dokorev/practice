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

public class Acmp415 {
    // functions if needed
    // vvvvvvvvv


    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            String s1 = in.next();
            String s2 = in.next();
            String s1low = s1.toLowerCase();
            String s2low = s2.toLowerCase();
            String best = s1 + s2;
            for (int shift = -s2.length(); shift <= s1.length(); shift++) {
                StringBuilder sb = new StringBuilder();
                boolean match = true;
                for (int i = Math.min(0, shift); i < Math.max(s1.length(), s2.length() + shift); i++) {
                    boolean in1 = (0 <= i && i < s1.length());
                    boolean in2 = (shift <= i && i < s2.length() + shift);
                    if (in1 && in2) {
                        if (s1low.charAt(i) != s2low.charAt(i - shift)) {
                            match = false;
                            break;
                        }
                    }
                    if (i == 0) {
                        sb.append(s1.charAt(0));
                    } else if (i == shift) {
                        sb.append(s2.charAt(0));
                    } else if (in1) {
                        sb.append(s1.charAt(i));
                    } else {
                        sb.append(s2.charAt(i - shift));
                    }
                }
                if (match) {
                    String sum = sb.toString();
                    if (sum.length() < best.length() || sum.length() == best.length() && sum.compareTo(best) < 0) {
                        best = sum;
                    }
                }
            }
            out.println(best);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
