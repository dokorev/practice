// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp623 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int n  = in.nextInt();
        int a = 1;
        int b = 1;
        for (int i = 0; i < n; i++) {
            int c = (a+b) % 10;
            a = b;
            b = c;
        }
        out.println(a%10);
        // ^^^^^^^^^^
        out.close();
    }
}