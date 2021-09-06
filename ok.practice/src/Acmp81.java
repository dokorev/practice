// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp81 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int n = in.nextInt();
        int a0 = in.nextInt();
        int min = a0;
        int max = a0;
        for ( int i = 1; i < n; i++) {
            int ai = in.nextInt();
            min = Math.min(min, ai);
            max = Math.max(max, ai);
        }
        out.println(min + " " + max);
        // ^^^^^^^^^^
        out.close();
    }
}