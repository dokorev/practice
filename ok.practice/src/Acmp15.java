// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int n  = in.nextInt();
        int s = 0;
        for (int i = 0; i < n * n; i++) {
            s += in.nextInt();
        }
        out.println(s/2);
        // ^^^^^^^^^^
        out.close();
    }
}