// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp680 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        long n = in.nextLong();
        Long ans = (3L << (n-1));
        out.println(ans);
        // ^^^^^^^^^^
        out.close();
    }
}
