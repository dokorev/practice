// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp91 {

    // Functions if Needed
    // vvvvvvvvv

    // ^^^^^^^^^

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int n = in.nextInt();
            int a[] = new int [1 + Math.max(4, n)];
            int b[] = new int [1 + Math.max(4, n)];
            a[1] = 2;
            a[2] = 3;
            a[3] = 4;
            a[4] = 7;
            b[1] = 1;
            b[2] = 5;
            b[3] = 6;
            b[4] = 8;
            int bi = 4;
            for (int ai = 5; ai <= n; ai++) {
                a[ai] = b[ai - 1] + b[ai - 3];
                for (int i = a[ai - 1] + 1; i < a[ai]; i++) {
                    if (bi <= n) {
                        b[bi] = i;
                        bi++;
                    }
                }
            }
            out.println(a[n]);
            out.println(b[n]);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
