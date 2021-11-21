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
                int cur = 0;
                int min = 0;
                int max = 0;
                for (char c : in.next().toCharArray()) {
                    if (c == '1') {
                        cur++;
                    } else if (c == '2') {
                        cur--;
                    } else {
                        throw new Error();
                    }
                    min = Math.min(min, cur);
                    max = Math.max(max, cur);
                }
                out.println(max - min + 1);
                // ^^^^^^^^^^
            } finally {
                out.close();
            }
        }
    }
