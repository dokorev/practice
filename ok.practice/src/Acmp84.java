// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp84 {
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
            int minI = Integer.MAX_VALUE;
            int maxI = Integer.MIN_VALUE;
            int minJ = Integer.MAX_VALUE;
            int maxJ = Integer.MIN_VALUE;
            for (int i = 0; i < sizeI; i++) {
                char a[] = in.next().toCharArray();
                for (int j = 0; j < sizeJ; j++) {
                    if (a[j] == '*') {
                        minI = Math.min(minI, i);
                        maxI = Math.max(maxI, i);
                        minJ = Math.min(minJ, j);
                        maxJ = Math.max(maxJ, j);
                    }
                }
            }
            for (int i = 0; i < sizeI; i++) {
                for (int j = 0; j < sizeJ; j++) {
                    if (minI <= i && i <= maxI && minJ <= j && j <= maxJ) {
                        out.print('*');
                    } else {
                        out.print('.');
                    }
                }
                out.println();
            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
