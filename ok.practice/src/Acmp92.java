// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp92 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int s = in.nextInt();
        int a1 = s/6;
        int a2 = (2*s)/3;
        out.print(a1);
        out.print(" ");
        out.print(a2);
        out.print(" ");
        out.println(a1);
        // ^^^^^^^^^^
        out.close();
    }
}
