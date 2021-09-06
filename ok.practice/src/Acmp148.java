// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp148 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int a = in.nextInt();
        int b = in.nextInt();
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        out.println(a);
        // ^^^^^^^^^^
        out.close();
    }
}