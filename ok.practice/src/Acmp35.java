// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int nTests = in.nextInt();
        for (int i = 0; i < nTests; i++) {
            int n = in.nextInt();
            int m = in.nextInt();
            out.println(19 * m + (n+239) * (n+366) / 2);
        }
        // ^^^^^^^^^^
        out.close();
    }
}