// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp282 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        long w = in.nextLong();
        long h = in.nextLong();
        long ans = ((w+1)*w)/2 * ((h+1)*h)/2;
        out.println(ans);
        // ^^^^^^^^^^
        out.close();
    }
}
