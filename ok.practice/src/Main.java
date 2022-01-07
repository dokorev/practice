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
           String q = in.next();
           char q1 = q.charAt(0);
           char qd = q.charAt(1);
           String r = in.next();
           char r1 = r.charAt(0);
           char rd = r.charAt(1);
           String k = in.next();
           char k1 = k.charAt(0);
           char kd = k.charAt(1);
           int count = 0;
           for (char let = 'A'; let <= 'H'; let++) {
               for (char dig = '1'; dig <= '8'; dig++) {
                   if (!(let == q1 && dig == qd || let == r1 && dig == rd || let == k1 && dig == kd)
                           && ((let - k1) * (let - k1) + (dig - kd) * (dig - kd) == 5 || (let == r1 || dig == rd)
                           || (let == q1 || dig == qd || Math.abs(let - q1) == Math.abs(dig - qd)))) {
                       count++;
                   }
               }
           }
           out.println(count);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
