// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp313 {

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
            int last[] = new int[101];
            int maxDiff = 0;
            for (int min = 1; min <= n; min++) {
                int route = in.nextInt();
                if (last[route] != 0) {
                    int diff = min - last[route];
                    maxDiff = Math.max (maxDiff, diff);
                }
                last[route] = min;
            }
            out.println(maxDiff);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
