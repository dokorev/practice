// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp354 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int n = in.nextInt();
        for (int d = 2; (long) d * d <= n;) {
            if (n % d == 0) {
                n /= d;
                out.print(d + "*");
            } else {
                d++;
            }
        }
        out.println(n);
        // ^^^^^^^^^^
        out.close();
    }
}
