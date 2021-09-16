// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int a  = in.nextInt();
        int b  = in.nextInt();
        int p = a*b;
        while (b != 0) {
            int t = a % b;
            a=b;
            b=t;
        }
        out.println(p / a);

        // ^^^^^^^^^^
        out.close();
    }
}