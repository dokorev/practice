    // acmp.ru
    import java.io.*;
    import java.util.*;
    public class Main {
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
                } else {
                    s = "";
                }
                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    int code;
                    if ('0' <= c && c <= '9') {
                        code = c - '0';
                    } else if ('A' <= c && c <= 'Q') {
                        code = c - 'A' + 10;
                    } else {
                        throw new Error();
                    }
                    code = ((code - (i+1)) % 27 + 27) % 27;
                    if (code == 0) {
                        out.print(' ');
                    } else {
                        out.print((char) ('a' + (code - 1)));
                    }
                }
                // ^^^^^^^^^^
            } finally {
                out.close();
            }
        }
    }
