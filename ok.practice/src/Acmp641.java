// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp641 {
    // functions if needed
    // vvvvvvvvv

    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            String s = in.nextLine();
            String max = "";
            for (int i = 0; i + 1 < s.length(); i++) {
                for (int j = i +1; j < s.length(); j++) {
                    String cur = s.substring(0, i) + s.substring(i + 1, j) + s.substring(j + 1);
                    if (cur.compareTo(max) > 0) {
                        max = cur;
                    }
                }
            }
            out.println(max);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
