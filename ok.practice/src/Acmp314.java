// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp314 {
    // functions if needed
    // vvvvvvvvv

    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            String a[] = new String[in.nextInt()];
            for (int i = 0; i < a.length; i++) {
                a[i] = "" + (i + 1);
            }
            Arrays.sort(a);
            String chosen = "" + in.nextInt();
            for (int i = 0; i < a.length; i++) {
                if (a[i].compareTo(chosen) == 0) {
                    out.println(i + 1);
                    return;
                }
            }
            throw new Error();
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
