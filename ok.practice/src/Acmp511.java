// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp511 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int k = in.nextInt();
        if (k > 145) {
            out.println("NO");
        } else {
            int TotalMin = (k - 1) * 5;
            int h = TotalMin / 60;
            int m = TotalMin % 60;
            out.println(h + " " + m);
            // ^^^^^^^^^^
            out.close();
        }
        // ^^^^^^^^^^
        out.close();
    }
}