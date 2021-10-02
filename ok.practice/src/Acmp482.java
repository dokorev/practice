// acmp.ru
import java.io.*;
import java.util.*;
import java.lang.Math;

public class Acmp482 {

    private static boolean isprime(int n) {
        for (int d = 2; d*d <= n; d++) {
            if (n % d == 0) {
                return false;
            }
        }
        return n>1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int n =in.nextInt();
            for (int f = 2; f<=n - f; f++) {
                if (isprime(f) && isprime(n-f)) {
                    out.println(f + " " + (n - f));
                    return;
                }
            }
            throw new Error();
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
