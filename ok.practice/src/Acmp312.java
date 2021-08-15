// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp312 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int ans = b + (b - a) * (c-2);
        out.println(ans);
        // ^^^^^^^^^^
        out.close();
    }
}
