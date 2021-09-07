// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp79 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int a = in.nextInt();
        int b = in.nextInt();
        int d = 1;
        for (int i = 0; i < b; i++) {
            d = (d * a) % 10;
        }
        out.println(d);
        // ^^^^^^^^^^
        out.close();
    }
}