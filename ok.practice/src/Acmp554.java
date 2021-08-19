// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp554 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int n = in.nextInt();
        int ans = 1 + ((n+1)*n)/2;
        out.println(ans);
        // ^^^^^^^^^^
        out.close();
    }
}
