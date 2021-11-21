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
                String line = in.nextLine();
                int sPos = line.indexOf(' ');
                String w1 = line.substring(0, sPos);
                String w2 = line.substring(sPos + 1, line.length());
                String lcW1 = w1.toLowerCase();
                String lcW2 = w2.toLowerCase();
                int lettCount[] = new int [26];
                for (int i = 0; i < w1.length(); i++) {
                    int lidx = lcW1.charAt(i) - 'a';
                    lettCount[lidx] = lettCount[lidx] + 1;
                }
                for (int i = 0; i < w2.length(); i++) {
                    int lidx = lcW2.charAt(i) - 'a';
                    lettCount[lidx]--;
                }
                boolean ans = true;
                for (int k = 0; k < lettCount.length; k++) {
                    if (lettCount[k] != 0) {
                       ans = false;
                       break;
                    }
                }
                if (ans) {
                    out.println("Yes");
                } else {
                    out.println("No");
                }
                // out.println(w1 + ", " + w2);
                // ^^^^^^^^^^
            } finally {
                out.close();
            }
        }
    }
