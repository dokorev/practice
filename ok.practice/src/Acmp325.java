// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp325 {
    // functions if needed
    // vvvvvvvvv

    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            in.useDelimiter("(\\s|,)+");
            String pos1 = in.next();
            String pos2 = in.next();
            char letter1 = pos1.charAt(0);
            char digit1 = pos1.charAt(1);
            char letter2 = pos2.charAt(0);
            char digit2 = pos2.charAt(1);
            if ((letter1 - letter2) * (letter1 - letter2) + (digit1 - digit2) * (digit1 - digit2) == 5) {
                out.println(1);
                return;
            }
            for (char letter = 'a'; letter <= 'h'; letter++) {
                for (char digit = '1'; digit <= '8'; digit++) {
                    if ((letter1 - letter) * (letter1 - letter) + (digit1 - digit) * (digit1 - digit) == 5
                            && (letter2 - letter) * (letter2 - letter) + (digit2 - digit) * (digit2 - digit) == 5) {
                        out.println(2);
                        return;
                    }
                }
            }
            out.println("NO");
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
