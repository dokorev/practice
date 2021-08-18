// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int ans = Math.max(Math.max(a, b), c) - Math.min(Math.min(a, b), c);
        out.println(ans);
        // ^^^^^^^^^^
        out.close();
    }
}
