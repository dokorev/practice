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

public class Acmp698 {
    // functions if needed
    // vvvvvvvvv
    public static int rankToInt(char c) {
        if (c == '6') {
            return 0;
        } else if (c == '7') {
            return 1;
        } else if (c == '8') {
            return 2;
        } else if (c == '9') {
            return 3;
        } else if (c == 'T') {
            return 4;
        } else if (c == 'J') {
            return 5;
        } else if (c == 'Q') {
            return 6;
        } else if (c == 'K') {
            return 7;
        } else if (c == 'A') {
            return 8;
        } else {
            throw new Error();
        }
    }

    public static int suitToInt(char c) {
        if (c == 'S') {
            return 0;
        } else if (c == 'C') {
            return 1;
        } else if (c == 'D') {
            return 2;
        } else if (c == 'H') {
            return 3;
        } else {
            throw new Error();
        }
    }
    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int nHave = in.nextInt();
            int nAttack = in.nextInt();
            int trump = suitToInt(in.next().charAt(0));
            boolean have[][] = new boolean [4][9];
            for (int i = 0; i < nHave; i++) {
                String card = in.next();
                have[suitToInt(card.charAt(1))][rankToInt(card.charAt(0))] = true;
            }
            boolean attack[][] = new boolean[4][9];
            for (int i = 0; i < nAttack; i++) {
                String card = in.next();
                attack[suitToInt(card.charAt(1))][rankToInt(card.charAt(0))] = true;
            }
            for (int suit = 0; suit < 4; suit++) {
                if (suit == trump) {
                    continue;
                }
                for (int ra = 0; ra < 9; ra++) {
                    if (attack[suit][ra]) {
                        boolean found = false;
                        for (int hr = ra + 1; hr < 9; hr++) {
                            if (have[suit][hr]) {
                                have[suit][hr] = false;
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            for (int hr = 0; hr < 9; hr++) {
                                if (have[trump][hr]) {
                                    have[trump][hr] = false;
                                    found = true;
                                    break;
                                }
                            }
                            if (!found) {
                                out.println("NO");
                                return;
                            }
                        }
                    }
                }
            }
            for (int ra = 0; ra < 9; ra++) {
                if (attack[trump][ra]) {
                    boolean found = false;
                    for (int hr = ra + 1; hr < 9; hr++) {
                        if (have[trump][hr]) {
                            have[trump][hr] = false;
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        out.println("NO");
                        return;
                    }
                }
            }
            out.println("YES");
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
