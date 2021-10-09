// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp531 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            long minx = in.nextLong();
            long miny = in.nextLong();
            long maxx = in.nextLong();
            long maxy = in.nextLong();
            long xc = in.nextLong();
            long yc = in.nextLong();
            long r = in.nextLong();
            minx -= xc;
            miny -= yc;
            maxx -= xc;
            maxy -= yc;
            xc = 0;
            yc = 0;
            long y = 0;
            long count = 0;
            for (long x = -r; x <= r; x++) {
                while ((y + 1) * (y+1) + x*x <= r*r) {
                    y++;
                }
                while (y*y + x*x > r*r) {
                    y --;
                }
                if (minx <= x && x <= maxx) {
                    if (!(y < miny || maxy < -y)) {
                        count += Math.min(y, maxy) - Math.max(-y, miny) +1;
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
