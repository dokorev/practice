// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp173 {

    // functions if needed
    // vvvvvvvvv
    public static int reverse(int n, int scale) {
        int res = 0;
        while (n > 0) {
            int d = n % scale;
            n /= scale;
            res *= scale;
            res += d;
        }
        return res;
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
            int first = -1;
            for (int scale = 2; scale <= 36; scale++) {
                if (n == reverse(n, scale)) {
                    if (count == 0) {
                        count = 1;
                        first = scale;
                    } else if (count == 1) {
                        count = 2;
                        out.println("multiple");
                        out.print(first + " " + scale) ;
                    } else {
                        out.print(" " + scale);
                    }

                }
            }
            if (count == 0) {
                out.println("none");
            } else if (count == 1) {
                out.println("unique");
                out.println(first);
            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
