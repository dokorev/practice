// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp47 {
    private static int sumOfDigits(int a) {
        int sum = 0;
        while (a > 0) {
            int d = a % 10;
            sum += d;
            a /= 10;
        }
        return sum;
    }
    private static boolean isAbetterThanB(int a, int b) {
        int sa = sumOfDigits(a);
        int sb = sumOfDigits(b);
        boolean res = (sa > sb) || ((sa == sb) && (a < b));
        return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int n = in.nextInt();
        int best = 1;
        int i = 2;
        while (i <= n) {
            if (n % i == 0) {
                // i is a divisor
                if (isAbetterThanB(i, best)) {
                    best = i;
                }
            }
            i++;
        }
        out.println(best);
        // ^^^^^^^^^^
        out.close();
    }
}
