// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp54 {

    // functions if needed
    // vvvvvvvvv

    // ^^^^^^^^^

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int sizeI = in.nextInt();
            int sizeJ = in.nextInt();
            int a[][] = new int [sizeI][sizeJ];
            for (int i = 0; i < sizeI; i++) {
                for (int j = 0; j < sizeJ; j++) {
                    a[i][j] = in.nextInt();
                }
            }
            int max = Integer.MIN_VALUE;
            for (int i = 0; i <sizeI; i++) {
                int minFixedI = Integer.MAX_VALUE;
                for (int j = 0; j <sizeJ; j++) {
                    minFixedI = Math.min(minFixedI, a[i][j]);
                }
                max = Math.max(max, minFixedI);
            }
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < sizeJ; j++) {
                int maxFixedJ = Integer.MIN_VALUE;
                for (int i = 0; i < sizeI; i++) {
                    maxFixedJ = Math.max(maxFixedJ, a[i][j]);
                }
                min = Math.min(min, maxFixedJ);
            }
            out.println(max + " " + min);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
