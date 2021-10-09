// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp159 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int n = in.nextInt();
            int r[] = new int[1 + n];
            for (int i = 1; i <= n; i++) {
                int ai = in.nextInt();
                r[ai] = i;
            }
            for (int i = 1; i <= n; i++) {
                if (i > 1) {
                    out.print(" ");
                }
                out.print(r[i]);
            }

            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
