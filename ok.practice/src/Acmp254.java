// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp254 {

    // Functions if Needed
    // vvvvvvvvv

    // ^^^^^^^^^

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int n = in.nextInt();
            int src[] = new int [n];
            for (int i = 0; i < n; i++) {
                src[i] = in.nextInt();
            }
            int dst[] = Arrays.copyOf(src, src.length);
            int nChanges = in.nextInt();
            for (int i = 0; i < nChanges; i++) {
                int from = in.nextInt();
                int to = in.nextInt();
                for (int j = 0; j < src.length; j++) {
                    if (src[j] == from) {
                        dst[j] = to;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                if (i > 0) {
                    out.print (" ");
                }
                out.print(dst[i]);
            }

            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
