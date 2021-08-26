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
        long k = in.nextLong();
        long ans = k+1 + ((n-2) * (1 + k) * k)/2;
        out.println(ans);
        // ^^^^^^^^^^
        out.close();
    }
}
