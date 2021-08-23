// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        long a = in.nextLong();
        long b = in.nextLong();
        if (a > b) {
            out.println(">");
        } else if (a < b) {
            out.println("<");
        } else if (a == b) {
            out.println("=");
        }
        // ^^^^^^^^^^
        out.close();
    }
}
