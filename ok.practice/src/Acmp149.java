// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp149 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int a[] = new int[in.nextInt()];
            for (int i = 0; i < a.length; i++) {
                a[i] = in.nextInt();
            }
            for (int i = a.length - 1; i >= 0; i--) {
                if (i < a.length - 1) {
                    out.print(" ");
                }
                out.println(a[i]);
            }

            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
