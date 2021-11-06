// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp388 {

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
            int minFixedI[] = new int [sizeI];
            Arrays.fill(minFixedI, Integer.MAX_VALUE);
            int maxFixedJ[] = new int [sizeJ];
            Arrays.fill(maxFixedJ, Integer.MIN_VALUE);
            for (int i = 0; i < sizeI; i++) {
                for (int j = 0; j < sizeJ; j++) {
                    a[i][j] = in.nextInt();
                    minFixedI[i] = Math.min(minFixedI[i], a[i][j]);
                    maxFixedJ[j] = Math.max(maxFixedJ[j], a[i][j]);
                }
            }
            int count = 0;
            for (int i = 0; i < sizeI; i++) {
                for (int j = 0; j < sizeJ; j++) {
                    if (a[i][j] == minFixedI[i] && a[i][j] == maxFixedJ[j]) {
                        count++;
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
