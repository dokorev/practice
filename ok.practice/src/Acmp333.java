// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp333 {
    // functions if needed
    // vvvvvvvvv
    public static boolean[] getDigits(String s) {
        boolean wasDigit[] = new boolean[10];
        for (char c : s.toCharArray()) {
            wasDigit[c - '0'] = true;
        }
        return wasDigit;
    }
    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            boolean a[] = getDigits(in.next());
            boolean b[] = getDigits(in.next());
            boolean c[] = getDigits(in.next());
            int count = 0;
            for (int i = 0; i < 10; i++) {
                if (a[i] && b[i] && c[i]) {
                    count++;
                }
            }
            out.println(count);
            boolean first = true;
            for (int i = 0; i < 10; i++) {
                if (a[i] && b[i] && c[i]) {
                    if (first) {
                        first = false;
                    } else {
                        out.print(" ");
                    }
                    out.print(i);
                }
            }

            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
