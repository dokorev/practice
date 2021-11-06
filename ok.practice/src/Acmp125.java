// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp125 {

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
            int a[][] = new int [n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = in.nextInt();
                }
            }
            int color[] = new int [n];
            for (int i =0; i < n; i++) {
                color[i] = in.nextInt();
            }
            int bad = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (color[i] != color[j] && a[i][j] == 1) {
                        bad++;
                    }
                }
            }
            out.println(bad);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
