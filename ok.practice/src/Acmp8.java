// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a * b == c) {
            out.println("YES");
        } else {
            out.println("NO");
        }
        // ^^^^^^^^^^
        out.close();
    }
}
