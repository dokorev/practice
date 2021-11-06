// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp298 {

    // functions if needed
    // vvvvvvvvv

    // ^^^^^^^^^

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int n = in.nextInt();
            int x[] = new int [n];
            int y[] = new int [n];
            for (int i = 0; i < n; i++) {
                x[i] = in.nextInt();
                y[i] = in.nextInt();
                if (x[i] == 0 && y[i] == 0) {
                    throw new Error();
                }
            }
            boolean wasHit[] = new boolean [n];
            int count = 0;
            for (int i = 0;  i< n; i++) {
                if (!wasHit[i]) {
                    count++;
                    for (int j = 0; j < n; j++) {
                        if (x[i] * y[j] == x[j] * y[i] && (y[i] > 0 || y[i] == 0 && x[i] > 0) == (y[j] > 0 || y[j] == 0 && x[j] > 0)) {
                            if (wasHit[j]) {
                                throw new Error();
                            }
                            wasHit[j] = true;
                        }
                    }
                }
            }
            out.println(count);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
