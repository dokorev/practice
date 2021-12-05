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
                char s[] = in.next().toCharArray();
                if (s[1] == '-') {
                    if (s[0] == 'x') {
                        int a = s[2] - '0';
                        int b = s[4] - '0';
                        out.println(b + a);
                    } else if (s[2] == 'x') {
                        int a = s[0] - '0';
                        int b = s[4] - '0';
                        out.println(a - b);
                    } else if (s[4] == 'x') {
                        int a = s[0] - '0';
                        int b = s[2] - '0';
                        out.println(a - b);
                    } else {
                        throw new Error();
                    }
                } else if (s[1] == '+') {
                    if (s[0] == 'x') {
                        int a = s[2] - '0';
                        int b = s[4] - '0';
                        out.println(b - a);
                    } else if (s[2] == 'x') {
                        int a = s[0] - '0';
                        int b = s[4] - '0';
                        out.println(b - a);
                    } else if (s[4] == 'x') {
                        int a = s[0] - '0';
                        int b = s[2] - '0';
                        out.println(a + b);
                    } else {
                        throw new Error();
                    }
                } else {
                    throw new Error();
                }
                // ^^^^^^^^^^
            } finally {
                out.close();
            }
        }
    }
