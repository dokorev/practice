// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp66 {

    // functions if needed
    // vvvvvvvvv

    // ^^^^^^^^^

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            // char kb[] = new char [] {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm', 'q'};
            String kb = "qwertyuiopasdfghjklzxcvbnmq";
            String l = in.nextLine();
            char key = l.charAt(0);
            for (int i = 0; i < kb.length(); i++) {
                if (kb.charAt(i) == key) {
                    out.println(kb.charAt(i+1));
                    return;
                }
            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
