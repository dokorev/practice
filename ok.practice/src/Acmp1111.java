// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp1111 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int n = in.nextInt();
        int ans = ((n/10) % 10);
        out.println(ans);
        // ^^^^^^^^^^
        out.close();
    }
}
