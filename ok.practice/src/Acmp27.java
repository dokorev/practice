// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp27 {

    // functions if needed
    // vvvvvvvvv

    // ^^^^^^^^^

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int sizeJ = in.nextInt();
            int sizeI = in.nextInt();
            boolean painted[][] = new boolean [sizeI][sizeJ];
            int n = in.nextInt();
            for (int r = 0; r < n; r++) {
                int minJ = in.nextInt();
                int minI = in.nextInt();
                int maxJ = in.nextInt() - 1;
                int maxI = in.nextInt() - 1;
                for (int i = minI; i <= maxI; i++) {
                    for (int j = minJ; j <= maxJ; j++) {
                        painted[i][j] = true;
                    }
                }
            }
            int count = 0;
            for (int i = 0; i < sizeI; i++) {
                for (int j = 0; j < sizeJ; j++) {
                    if (!painted[i][j]) {
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
