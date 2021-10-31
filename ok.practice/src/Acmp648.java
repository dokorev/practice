// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp648 {

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
            int diff = 0;
            for (int i = 0; i < a.length / 2; i++) {
                diff -= a[i];
            }
            for (int i = a.length / 2; i < a.length; i++) {
                diff += a[i];
            }
            out.println(diff);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
