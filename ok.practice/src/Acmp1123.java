// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp1123 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        if (x1 + 2 == x2 && y1 + 1 == y2) {
            out.println("YES");
        } else if (x1 + 1 == x2 && y1 + 2 == y2) {
            out.println("YES");
        } else if (x1 - 2 == x2 && y1 + 1 == y2) {
            out.println("YES");
        } else if (x1 - 1 == x2 && y1 + 2 == y2) {
            out.println("YES");
        } else if (x1 + 2 == x2 && y1 - 1 == y2) {
            out.println("YES");
        } else if (x1 + 1 == x2 && y1 - 2 == y2) {
            out.println("YES");
        } else if (x1 - 2 == x2 && y1 - 1 == y2) {
            out.println("YES");
        } else if (x1 - 1 == x2 && y1 - 2 == y2) {
            out.println("YES");
        } else {
            out.println("NO");
        }
        // ^^^^^^^^^^
        out.close();
    }
}