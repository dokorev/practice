// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp52 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int n = in.nextInt();
        int d1 = n/100000;
        int d2 = n/10000 % 10;
        int d3 = n/1000 % 10;
        int d4 = n/100 % 10;
        int d5 = n/10 % 10;
        int d6 = n % 10;
        if (d1 + d2 + d3 == d4 + d5 + d6) {
            out.println("YES");
        } else {
            out.println("NO");
        }
        // ^^^^^^^^^^
        out.close();
    }
}
