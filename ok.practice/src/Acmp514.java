// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp514 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int k = in.nextInt();
        int n = 1;
        int s = 0;
        while (s + n <= k) {
            s += n;
            n++;
        }
        out.println(n-1);
        // ^^^^^^^^^^
        out.close();
    }
}