// acmp.ru
import java.io.*;
import java.util.*;
import java.lang.Math;

public class Acmp36 {
    public static boolean isPrime(int n) {
        for (int d = 2; d * d <= n; d++) {
            if (n % d == 0) {
                return false;
            }
        }
        return n >1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int n = in.nextInt();
            int count = 0;
            for (int i = n + 1; i < 2 * n; i++) {
                if (isPrime(i)) {
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
