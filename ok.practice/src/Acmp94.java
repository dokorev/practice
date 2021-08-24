// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp94 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int sword = in.nextInt();
        int heads = in.nextInt();
        int recovery = in.nextInt();
        if (sword >= heads) {
            out.println(1);
        } else if (sword > recovery) {
            out.println(1 + (heads - recovery - 1) / (sword - recovery));
        } else {
            out.println("NO");
        }
        // ^^^^^^^^^^
        out.close();
    }
}