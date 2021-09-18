// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp464 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int n = in.nextInt();
        n--;
        int count = 0;
        while (n > 0) {
            count +=n%2;
            n /= 2;
        }
        out.println( count % 3);
        // ^^^^^^^^^^
        out.close();
    }
}