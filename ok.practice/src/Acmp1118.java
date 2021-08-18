// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp1118 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int h = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int d = a- b;
        // Needs to have max because a > h, therefore roundup may be incorrect
        int ans = Math.max((h-a + d -1)/d + 1, 1);
        out.println(ans);
        // ^^^^^^^^^^
        out.close();
    }
}
