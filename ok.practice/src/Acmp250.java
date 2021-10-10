// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp250 {

    public static boolean isGood(int n) {
        boolean wasDigits[] = new boolean[10];
        while (n > 0) {
            wasDigits[n % 10] = true;
            n /= 10;
        }
        int count = 0;
        for (int i = 0; i <= 9; i++) {
            if (wasDigits[i]) {
                count++;
            }
        }
        return count <= 2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solutionåç
            // vvvvvvvvvv
            int n = in.nextInt();
            for (int d = 0; ; d++) {
                if (isGood(n - d)) {
                    out.println(n - d);
                    return;
                }
                if (isGood(n + d)) {
                    out.println(n + d);
                    return;
                }
            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
