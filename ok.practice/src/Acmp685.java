// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp685 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int a3 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int b3 = in.nextInt();
        // find Bs
        int mxB = Math.max(Math.max(b1, b2), b3);
        int mnB = Math.min(Math.min(b1, b2), b3);
        int mdB = b1 + b2 + b3 - mxB - mnB;
        // find As
        int mxA = Math.max(Math.max(a1, a2), a3);
        int mnA = Math.min(Math.min(a1, a2), a3);
        int mdA = a1 + a2 + a3 - mxA - mnA;
        int ans = mxA * mxB + mdA * mdB + mnA * mnB;
        out.println(ans);
        // ^^^^^^^^^^
        out.close();
    }
}
