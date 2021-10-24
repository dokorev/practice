// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp577 {

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
            for (int d = 0; d <= 9; d++) {
                int count = 0;
                for (int i = 1; i <= sizeI; i++) {
                    for (int j = 1; j <= sizeJ; j++) {
                        int t = i * j;
                        while (t > 0) {
                            if (t % 10 == d) {
                                count++;
                            }
                            t /= 10;
                        }
                    }
                }
                out.println(count);
            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
