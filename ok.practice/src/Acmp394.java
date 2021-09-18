// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp394 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int nFriends = in.nextInt();
        int nOranges = in.nextInt();
        int a = nFriends;
        int b = nOranges;
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        int gcd = a;
        out.println(nFriends/gcd);
        // ^^^^^^^^^^
        out.close();
    }
}