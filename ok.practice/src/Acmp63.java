// acmp.ru
import java.io.*;
import java.util.*;
import java.lang.Math;

public class Acmp63 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int s = in.nextInt();
        int p = in.nextInt();
        double a1 = (s + (Math.sqrt(s * s - 4 * p)))/2;
        double b1 = s - a1;
        double a2 = (s - (Math.sqrt(s * s - 4 * p)))/2;
        double b2 = s - a2;
        if (a1 >= 0 && b1 >= 0) {
            double min = Math.min(a1, b1);
            double max = Math.max(a1, b1);
            out.println(Math.round(min) + " " + Math.round(max));
        } else {
            double min = Math.min(a2, b2);
            double max = Math.max(a2, b2);
            out.println(Math.round(min) + " " + Math.round(max));
        }
        // ^^^^^^^^^^
        out.close();
    }
}
