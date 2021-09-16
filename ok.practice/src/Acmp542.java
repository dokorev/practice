// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp542 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int n  = in.nextInt();
        int r = 0;
        while (n != 0) {
            int d = n%2;
            n /= 2;
            r= r * 2 + d;
        }
        out.println(r);
        // ^^^^^^^^^^
        out.close();
    }
}