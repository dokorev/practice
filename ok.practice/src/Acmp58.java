// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp58 {

    // functions if needed
    // vvvvvvvvv
    public static void solveOne(Scanner in, PrintWriter out) {
        int sizeI = in.nextInt();
        int sizeJ = in.nextInt();
        int a[][] = new int [sizeI][sizeJ];
        for (int i = 0; i < sizeI; i++) {
            for (int j = 0; j < sizeJ; j++) {
                a[i][j] = in.nextInt();
            }
        }
        for (int i = 1; i < sizeI; i++) {
            for (int j = 1; j < sizeJ; j++) {
                int s = a[i][j] + a[i - 1][j] + a[i][j-1] + a[i-1][j-1];
                if (s == 0 || s == 4) {
                    out.println("NO");
                    return;
                }
            }
        }
        out.println("YES");
    }
    // ^^^^^^^^^

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                solveOne(in, out);
            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
