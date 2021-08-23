// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp504 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int k = in.nextInt();
        if (k % 3 == 0) {
            out.println("GCV");
        } else if (k % 3 == 1) {
            out.println("VGC");
        } else if (k % 3 == 2) {
            out.println("CVG");
        }
        // ^^^^^^^^^^
        out.close();
    }
}
