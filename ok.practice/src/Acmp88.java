// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp88 {

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
            int a[][] = new int[n*n][n*n];
            for (int i = 0; i < n * n; i++) {
                for (int j = 0; j < n*n; j++) {
                    a[i][j] = in.nextInt();
                }
            }
            for (int i = 0; i < n*n; i++) {
                boolean was[] = new boolean [1 + 100];
                for (int j = 0; j < n*n; j++) {
                    was[a[i][j]] = true;
                }
                for (int x = 1; x <= n * n; x++) {
                    if (!was[x]) {
                        out.println("Incorrect");
                        return;
                    }
                }
            }
            for (int j = 0; j < n*n; j++) {
                boolean was[] = new boolean [1 + 100];
                for (int i = 0; i < n*n; i++) {
                    was[a[i][j]] = true;
                }
                for (int x = 1; x <= n * n; x++) {
                    if (!was[x]) {
                        out.println("Incorrect");
                        return;
                    }
                }
            }
            for (int i0 = 0; i0 < n*n; i0 += n) {
                for (int j0 = 0; j0 < n * n; j0 += n) {
                    boolean was[] = new boolean[1 + 100];
                    for (int i = i0; i < i0 + n; i++) {
                        for (int j = j0; i < j0 + n; j++) {
                            was[a[i][j]] = true;
                        }
                    }
                    for (int x = 1; x <= n * n; x++) {
                        if (!was[x]) {
                            out.println("Incorrect");
                            return;
                        }
                    }
                }
            }
            out.println("Correct");
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
