// https://acmp.ru/index.asp?main=task&id_task=4
import java.io.*;
import java.util.*;

public class Acmp4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int d = in.nextInt();
        int ans = d * 100 + 90 + (9-d);
        out.println(ans);
        // ^^^^^^^^^^
        out.close();
    }
}
