// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int r1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        int r2 = in.nextInt();
        int d2 = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
        if ((r1 - r2) * (r1 - r2) <= d2 && d2 <= (r1 + r2) * (r1 + r2)) {
            out.println("YES");
        } else {
            out.println("NO");
        }
        // ^^^^^^^^^^
        out.close();
    }
}
