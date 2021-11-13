// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp297 {

    // functions if needed
    // vvvvvvvvv

    // ^^^^^^^^^

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            String l = in.nextLine();
            int ans = 0;
            for (char d : l.toCharArray()) {
                switch(d) {
                    case '0':
                    case '6':
                    case '9':
                        ans++;
                        break;
                    case '8':
                        ans += 2;
                        break;
                }
            }
            out.println(ans);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
