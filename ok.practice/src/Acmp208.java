// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp208 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int n = in.nextInt();
        int pow = 1;
        while (pow * 2 <= n) {
            pow *= 2;
        }
        int n0 = n;
        int max = n;
        do {
            n = n / 2 + n % 2 * pow;
            max = Math.max(max, n);
        } while (n != n0);
        out.println(max);

        // ^^^^^^^^^^
        out.close();
    }
}