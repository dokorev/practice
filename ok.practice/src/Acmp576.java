// acmp.ru
import java.io.*;
import java.util.*;
import java.lang.Math;

public class Acmp576 {
    private static int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int n = in.nextInt();
            int count = 0;
            for (int d = 1; d<n; d++) {
                if (gcd(n, d) == 1) {
                    count++;
                }
            }
            out.println(count);

            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
