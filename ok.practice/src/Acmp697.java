// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp697 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int l = in.nextInt();
        int w = in.nextInt();
        int h = in.nextInt();
        int ans = ((2*h)*(l+w)+15)/16;
        out.println(ans);
        // ^^^^^^^^^^
        out.close();
    }
}
