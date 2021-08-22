// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp513 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int n = in.nextInt();
        Long ans = ((1L << n) - 1 - n);
        out.println(ans);
        // ^^^^^^^^^^
        out.close();
    }
}
