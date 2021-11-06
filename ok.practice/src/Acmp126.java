// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp126 {

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
            int a [][] = new int [n][n];
            for (int i  = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = in.nextInt();
                }
            }
            int minLen = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    for (int k = j + 1; k < n; k++) {
                        minLen = Math.min(minLen, a[i][j] + a[j][k] + a[k][i]);
                    }
                }
            }
            out.println(minLen);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
