// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp935 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        if ((x1 + y1 + x2 + y2) % 2 == 0) {
            out.println("YES");
        } else {
            out.println("NO");
        }
        // ^^^^^^^^^^
        out.close();
    }
}