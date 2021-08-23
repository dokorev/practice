// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp597 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        Long r1 = in.nextLong();
        Long r2 = in.nextLong();
        Long r3 = in.nextLong();
        if (r1 >= r2 + r3) {
            out.println("YES");
        } else {
            out.println("NO");
        }
        // ^^^^^^^^^^
        out.close();
    }
}
