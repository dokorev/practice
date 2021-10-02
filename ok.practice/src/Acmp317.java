// acmp.ru
import java.io.*;
import java.util.*;
import java.lang.Math;

public class Acmp317 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            int w = in.nextInt();
            int count = 0;
            for (int ix = 0; ix * x <= w; ix ++) {
                for (int iy = 0; ix* x + iy <= w; iy++) {
                    for (int iz = 0; ix * x + iy * y + iz * z <= w; iz++) {
                        if (ix * x + iy * y + iz * z == w) {
                            count++;
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
