// acmp.ru

import java.io.*;
import java.util.*;

public class Acmp688 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        long xg = in.nextLong();
        long yg = in.nextLong();
        long xd = in.nextLong();
        long yd = in.nextLong();
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            long x = in.nextLong();
            long y = in.nextLong();
            if (4 * ((x-xg) * (x - xg) + (y-yg) * (y-yg)) < (x-xd) * (x-xd) + (y-yd) * (y-yd))  {
                out.println(i);
                return;
            } else {
                out.println("NO");
            }
        }
        // ^^^^^^^^^^
        out.close();
    }
}