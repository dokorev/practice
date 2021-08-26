// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp667 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        if (k <= 2) {
            out.println(0);
        } else if (m < ((n+k-2-1)/(k-2))*2) {
            out.println(0);
        } else {
            out.println((n+m+k - 1)/k  );
        }
        // ^^^^^^^^^^
        out.close();
    }
}