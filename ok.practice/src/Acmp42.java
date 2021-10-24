// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp42 {

    // functions if needed
    // vvvvvvvvv

    // ^^^^^^^^^

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int n = in.nextInt();
            long a[][] = new long [n+1][n+1];
            for (int heads = 1;  heads <= n; heads++) { // a[d][h] = best answer for d dragons and h heads
                a[1][heads] = heads;
            }
            for (int d = 2; d <= n; d++) {
                for (int heads = d; heads <= n; heads++) {
                    long mx = 0; // best solution for d dragons and h heads
                    for (int fH = 1; fH <= heads - 1; fH++) {
                        int rH = heads - fH;
                        long score = fH * a[d-1][rH];
                        mx = Math.max (mx, score);
                    }
                    a[d][heads] = mx;
                }
            }
            long ans = 0;
            for (int d = 1; d <= n; d++) {
                ans = Math.max(ans, a[d][n]);
            }
            out.println(ans);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
