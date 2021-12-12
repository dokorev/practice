// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp600 {
    // functions if needed
    // vvvvvvvvv

    public static boolean belongs(String s) {
        if (s.length() % 3 != 0) {
            return false;
        }
        int len = s.length() / 3;
        for (int i = 0; i < len; i ++) {
            if (s.charAt(i) != '0') {
                return false;
            }
        }
        for (int i = len; i < 2 *len; i++) {
            if (s.charAt(i) != '1') {
                return false;
            }
        }
        for (int i = 2 * len; i < 3 *len; i++) {
            if (s.charAt(i) != '2') {
                return false;
            }
        }
        return true;
    }

    public static void solveOne(Scanner in, PrintWriter out) {
        String s = in.next();
        if (belongs(s)) {
            out.println("YES");
        } else {
            out.println("NO");
        }
    }
    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                solveOne(in, out);
            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
