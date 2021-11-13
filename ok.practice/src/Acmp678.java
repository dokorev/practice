// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp678 {

    // functions if needed
    // vvvvvvvvv

    // ^^^^^^^^^

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            //ballpos = which cup sits ball
            int ballpos = 1;
            String l = in.nextLine();
            for (int i = 0; i < l.length(); i++) {
                char op = l.charAt(i);
                if (op == 'A') {
                    if (ballpos == 1) {
                        ballpos = 2;
                    } else if (ballpos == 2) {
                        ballpos = 1;
                    }
                } else if (op == 'B') {
                    if (ballpos == 2) {
                        ballpos = 3;
                    } else if (ballpos == 3) {
                        ballpos = 2;
                    }
                } else if (op == 'C') {
                    if (ballpos == 1) {
                        ballpos = 3;
                    } else if (ballpos == 3) {
                        ballpos = 1;
                    }
                }
            }
            out.println(ballpos);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
