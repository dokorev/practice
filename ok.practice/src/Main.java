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
                int sizeI = in.nextInt();
                in.nextLine();
                int min = Integer.MAX_VALUE;
                for (int i = 0; i < sizeI; i++) {
                    int count = 0;
                    for (char c : in.nextLine().toCharArray()) {
                        if (c == '.') {
                            count++;
                        }
                    }
                    min = Math.min(min, count);
                }
                out.println(min);
                // ^^^^^^^^^^
            } finally {
                out.close();
            }
        }
    }
