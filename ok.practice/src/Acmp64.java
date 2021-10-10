// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp64 {

    public static boolean isPrime(int n) {
        for (int d = 2; d * d  <= n; d++) {
            if (n % d == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int digits[] = new int[10001];
            int pos = 1;
            for (int i = 2; pos < digits.length; i++) {
                if (isPrime(i)) {
                    int pow = 1;
                    while (pow * 10 <= i) {
                        pow *= 10;
                    }
                    for (; pow > 0; pow /= 10) {
                        int d = i / pow % 10;
                        if (pos < digits.length) {
                            digits[pos] = d;
                            pos++;
                        }
                    }
                }
            }
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                out.print(digits[in.nextInt()]);
            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
