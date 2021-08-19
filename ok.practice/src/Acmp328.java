// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp328 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        long n = in.nextLong();
        long ans = n * (n+1) * (n+2)/2;
        out.println(ans);
        // ^^^^^^^^^^
        out.close();
    }
}
