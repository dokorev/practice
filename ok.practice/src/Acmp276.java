// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp276 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int sum  = in.nextInt();
        int count = in.nextInt();
        int biggerCount = sum % count;
        int lessCount = count - sum % count;
        int lessValue = sum / count;
        int biggerValue = sum / count + 1;
        for (int i = 0;  i < lessCount; i++) {
            out.print(" " + lessValue);
        }
        for (int i = 0; i < biggerCount; i++) {
            out.print(" " + biggerValue);
        }

        // ^^^^^^^^^^
        out.close();
    }
}