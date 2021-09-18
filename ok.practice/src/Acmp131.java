// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp131 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int n = in.nextInt();
        int maxManAge = 0;
        int Pos = -1;
        for (int i = 1; i <= n; i++) {
            int age = in.nextInt();
            int sex = in.nextInt();
            if (sex == 1) {
                if (age > maxManAge) {
                    maxManAge = age;
                    Pos = i;
                }
            }
        }
        out.println(Pos);
        // ^^^^^^^^^^
        out.close();
    }
}