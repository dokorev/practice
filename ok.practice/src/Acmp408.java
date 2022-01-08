// acmp.ru
//
// ACMP 570 with WA 11
// possible problem is
// 4 4
// * . . .
// . * . .
// . . * .
// . . . *
// SQUARE <-- should not be square as the original square cannot be 2x2

import java.io.*;
import java.util.*;

public class Acmp408 {
    // functions if needed
    // vvvvvvvvv

    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int width = in.nextInt();
            String lines[] = new String[in.nextInt()];
            in.nextLine();
            for (int i = 0; i < lines.length; i++) {
                lines[i] = in.nextLine().trim();
                if (lines[i].length() > width) {
                    out.println("Impossible.");
                    return;
                }
            }
            String spaces = "";
            for (int i = 0; i < width; i++) {
                spaces += " ";
            }
            for (String line : lines) {
                int rem = width - line.length();
                out.println(spaces.substring(0, rem / 2) + line + spaces.substring(0, rem - rem/2));
            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
