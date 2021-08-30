// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp1121 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        if (x2 - x1 == y2 - y1) {
            out.println("YES");
        } else if (x2 - x1 == y1 - y2) {
            out.println("YES");
        } else if (x1 - x2 == y2 - y1) {
            out.println("YES");
        } else if (x1 - x2 == y1 - y2) {
            out.println("YES");
        } else if (x1 == x2) {
            out.println("YES");
        } else if (y1 == y2){
            out.println("YES");
        } else {
            out.println("NO");
        }

        // ^^^^^^^^^^
        out.close();
    }
}