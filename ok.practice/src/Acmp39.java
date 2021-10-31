// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp39 {

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
            int max = 0;
            int sum = 0;
            for (int i = a.length - 1; i >= 0; i--) {
                max = Math.max(max, a[i]);
                sum += max;
            }
            out.println(sum);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
