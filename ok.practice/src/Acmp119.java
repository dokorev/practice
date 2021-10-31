// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp119 {

    // functions if needed
    // vvvvvvvvv

    // ^^^^^^^^^

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int t[] = new int [in.nextInt()];
            for (int i = 0; i < t.length; i++) {
                int h = in.nextInt();
                int m = in.nextInt();
                int s = in.nextInt();
                t[i] = h * 60 * 60 + m * 60 + s;
            }
            Arrays.sort(t);
            for (int i = 0; i < t.length; i++) {
                int h = t[i] / 3600;
                int m = t[i] / 60 % 60;
                int s = t[i] % 60;
                out.println(h + " " + m + " " + s);
            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
