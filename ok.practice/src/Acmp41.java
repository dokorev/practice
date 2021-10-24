// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp41 {

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
            int count[] = new int [201];
            for (int i = 0; i < n; i++) {
                count[in.nextInt() + 100]++;
            }
            boolean first = true;
            for (int v = -100; v <= 100; v++) {
                for (int i = 0; i < count[v + 100]; i++) {
                    if (first) {
                        first = false;
                    } else {
                        out.print(" ");
                    }
                    out.print(v);
                }
            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
