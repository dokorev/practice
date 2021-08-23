// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp539 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int n = in.nextInt();
        if (n == 1) {
            out.println(0);
        }
        else if (n % 2 == 0) {
            out.println(n/2);
        } else {
            out.println(n);
        }
        // ^^^^^^^^^^
        out.close();
    }
}
