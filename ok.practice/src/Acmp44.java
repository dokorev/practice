// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp44 {
    // functions if needed
    // vvvvvvvvv

    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            String s;
            if (in.hasNext()) {
                s = in.next();
            } else  {
                s = "";
            }
            int count = 0;
            for (int i  = 0; i + 4 < s.length(); i++) {
                String sub = s.substring(i, i + 5);
                if (sub.compareTo(">>-->") == 0 || sub.compareTo("<--<<") == 0) {
                    count++;
                }
            }
            out.println(count);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
