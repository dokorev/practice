// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp98 {

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
            int a[] = new int [n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            int first = 0;
            int last = n - 1;
            int counter[] = new int [2];
            int player = 0;
            while (first <= last) {
                if (a[last] > a[first]) {
                    // last >
                    counter[player] += a[last];
                    last--;
                } else {
                    // first <=
                    counter[player] += a[first];
                    first++;
                }
                player ^= 1;
            }
            out.println(counter[0] + ":" + counter[1]);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
