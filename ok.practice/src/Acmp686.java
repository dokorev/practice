// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp686 {

    // functions if needed
    // vvvvvvvvv

    // ^^^^^^^^^

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int a[] = new int [in.nextInt()];
            for (int i = 0; i < a.length; i++) {
                a[i] = in.nextInt();
            }
            Arrays.sort(a);
            int b[] = new int [a.length];
            int first = 0;
            int last = b.length - 1;
            for (int i = 0; i < a.length; i++) {
                if (i % 2 == 0) {
                    b[first] = a[i];
                    first++;
                } else {
                    b[last] = a[i];
                    last--;
                }
            }
            for (int i = 0; i < b.length; i++) {
                if (i > 0) {
                    out.print(" ");
                }
                out.println(b[i]);
            }

            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
