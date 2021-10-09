// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int n = in.nextInt();
            int v[] = new int[1 + n];
            for (int i = 1; i <= n; i++) {
                v[i] = in.nextInt();
            }
            int max = -1;
            int maxI = -1;
            for (int i = 1; i <= n; i++) {
                int p = in.nextInt();
                if (p * v[i] > max) {
                    max = p * v[i];
                    maxI = i;
                }
            }
            out.println(maxI);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
