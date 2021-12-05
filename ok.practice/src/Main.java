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
                int len = 1;
                for (char c : ("aaa" + in.next() + "A").toCharArray()) {
                    if ('a' <= c && c <= 'z') {
                        len++;
                    } else if ('A' <= c && c <= 'z') {
                        if (len < 2 || 4 < len) {
                            out.println("No");
                            return;
                        }
                        len = 1;
                    } else {
                        throw new Error();
                    }
                }
                out.println("Yes");
                // ^^^^^^^^^^
            } finally {
                out.close();
            }
        }
    }
