// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp326 {

    // Functions if Needed
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
            int count[] = new int [201];
            for (int x : a) {
                count[x+100]++;
            }
            int best = 0;
            int bestCount = 0;
            for (int v = -100; v<= 100; v++) {
                if (count[v + 100] > bestCount) {
                    best = v;
                    bestCount = count[v + 100];
                }
            }
            boolean first = true;
            for (int x : a) {
                if (x != best) {
                    if (first) {
                        first = false;
                    } else {
                        out.print(" ");
                    }
                    out.print(x);
                }
            }
            for (int i = 0; i < bestCount; i++) {
                if (first) {
                    first = false;
                } else {
                    out.print(" ");
                }
                out.print(best);
            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
