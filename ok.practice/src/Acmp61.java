// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp61 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int a = in.nextInt();
        int w = in.nextInt();
        int b = in.nextInt();
        int x = in.nextInt();
        int c = in.nextInt();
        int y = in.nextInt();
        int d = in.nextInt();
        int z = in.nextInt();
        if ((a+b+c+d) > (w+x+y+z)) {
            out.println("1");
        } else if ((a+b+c+d) < (w+x+y+z)) {
            out.println("2");
        } else {
            out.println("DRAW");
        }
        // ^^^^^^^^^^
        out.close();
    }
}
