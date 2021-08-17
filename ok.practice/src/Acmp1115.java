// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp1115 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int n = in.nextInt();
        int k = in.nextInt();
        int r = k % n;
        int q = k / n;
        out.println(String.format("%d %d %d", q, r, (n-r)%n));
        // ^^^^^^^^^^
        out.close();
    }
}
