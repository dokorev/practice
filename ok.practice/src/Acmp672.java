// acmp.ru
import java.io.*;
import java.util.*;
import java.lang.Math;

public class Acmp672 {
    public static boolean sumEqProd(long n) {
        int sum = 0;
        int p = 1;
        while (n > 0) {
            int d = (int)(n%10);
            n /= 10;
            sum += d;
            p *= d;
            if (p == 0 || p > 90) {
                return false;
            }
        }
        return sum == p;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int n = in.nextInt();
            if (n==1) {
                out.println("10 0");
                return;
            }
            if (n==7) {
                out.println("84 1111127");
                return;
            }
            if (n==8) {
                out.println("224 11111128");
                return;
            }
            if (n == 9) {
                out.println("144 111111129");
                return;
            }
            if (n==10) {
                out.println("45 1111111144");
                return;
            }
            long start = 1;
            for (int i = 0; i < n - 1; i ++ ) {
                start *= 10;
            }
            long first = 0;
            long count = 0;
            for (long i = start * 10 - 1; i >= start; i--) {
                if (sumEqProd(i)) {
                    count++;
                    first = i;
                }
            }
            out.println (count + " " + first);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
