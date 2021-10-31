// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp321 {

    // functions if needed
    // vvvvvvvvv

    static int countDigits(int n, int scale, int d) {
        int  count = 0;
        while (n > 0) {
            if (n % scale == d) {
                count++;
            }
            n /= scale;
        }
        return count;
    }

    static boolean hasEqualDigits(int n, int scale) {
        for (int d = 0; d < scale; d++) {
            if (countDigits(n, scale, d) > 1) {
                return true;
            }
        }
        return false;
    }

    // ^^^^^^^^^

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int n = in.nextInt();
            boolean first = true;
            for (int scale = 2; scale <= 36; scale++) {
                if (!hasEqualDigits(n, scale)) {
                    if (first) {
                        first = false;
                    } else {
                        out.print(" ");
                    }
                    out.print(scale);
                }
            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
