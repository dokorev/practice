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
                int num = 0;
                int curLine = 0;
                for (char c : in.next().toCharArray()) {
                    if ('0' <= c && c <= '9') {
                        num = num * 10 + (c - '0');
                    } else if ('A' <= c && c <= 'Z') {
                        if (num == 0) {
                            num = 1;
                        }
                        for (int i = 0; i < num; i++) {
                            out.print(c);
                            curLine++;
                            if (curLine == 40) {
                                out.println();
                                curLine = 0;
                            }
                        }
                        num = 0;
                    } else {
                        throw new Error();
                    }
                }
                // ^^^^^^^^^^
            } finally {
                out.close();
            }
        }
    }
