// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp1114 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int v = in.nextInt();
        int t = in.nextInt();
        int ans = (109 + ((v * t) % 109)) % 109 + 1;
        out.println(ans);
        // ^^^^^^^^^^
        out.close();
    }
}
