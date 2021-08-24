// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp606 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        if (x + y > z && x + z > y && y + z > x) {
            out.println("YES");
        } else {
            out.println("NO");
        }
        // ^^^^^^^^^^
        out.close();
    }
}
