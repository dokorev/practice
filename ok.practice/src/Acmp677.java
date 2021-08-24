// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp677 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int k = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int d = in.nextInt();
        if ((k * m * n - m * n - k * n - k * m) > 0 &&  (d * k * m * n % (k * m * n - m * n - k * n - k*m)) == 0) {
            int x = (d * k * m * n) / (k * m * n - m * n - k * n - k * m);
            if (x % k == 0 && x % m == 0 && x % n == 0) {
                out.println(x);
            } else {
                out.println(-1);
            }
        } else {
            out.println(-1);
        }
        // ^^^^^^^^^^
        out.close();
    }
}
