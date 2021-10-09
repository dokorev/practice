// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp124 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int nv = in.nextInt();
            int count[] = new int[1 + nv];
            int nE = in.nextInt();
            for (int i = 0; i < 2 * nE; i++) {
                count[in.nextInt()]++;
            }
            for (int i = 1; i <= nv; i++) {
                if (i > 1) {
                    out.print(" ");
                }
                out.print(count[i]);
            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
