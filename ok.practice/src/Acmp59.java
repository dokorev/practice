// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp59 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int n  = in.nextInt();
        int scale = in.nextInt();
        int p = 1;
        int s = 0;
        while (n > 0) {
            int d = n%scale;
            n /= scale;
            p *= d;
            s += d;
        }
        out.println(p-s);
        // ^^^^^^^^^^
        out.close();
    }
}