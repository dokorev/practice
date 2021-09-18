// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp106 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int n = in.nextInt();
        int n0 = 0;
        int n1 = 0;
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            if (x == 0) {
                n0 ++;
            } else if (x==1) {
                n1 ++;
            } else {
                throw new Error ();
            }
        }
        out.println(Math.min(n0, n1));
        // ^^^^^^^^^^
        out.close();
    }
}