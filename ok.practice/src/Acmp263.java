// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp263 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int n = in.nextInt();
        int i = in.nextInt();
        int j = in.nextInt();
        int d1 = n + Math.min(j, i) - Math.max(j, i);
        int d2 = Math.max(j, i) - Math.min(j, i);
        int ans = Math.min(d1, d2) - 1;
        out.println(ans);
        // ^^^^^^^^^^
        out.close();
    }
}
