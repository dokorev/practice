// acmp.ru

import java.io.*;
import java.util.*;

public class Acmp698b {
    // functions if needed
    // vvvvvvvvv
    public static int suitToInt(char c) {
        switch (c) {
            case 'S':
                return 0;
            case 'C':
                return 1;
            case 'D':
                return 2;
            default:
                return 3;
        }
    }
    public static int rankToInt(char c) {
        switch (c) {
            case '6':
                return 0;
            case '7':
                return 1;
            case '8':
                return 2;
            case '9':
                return 3;
            case 'T':
                return 4;
            case 'J':
                return 5;
            case 'Q':
                return 6;
            case 'K':
                return 7;
            default:
                return 8;
        }
    }

    public static boolean fight(boolean cards[][], int s, int r, int t) {
        for (int i = r + 1; i <= 8; i++)  {
            if (cards[s][i]) {
                cards[s][i] = false;
                return true;
            }
        }
        if (s != t) {
            for (int i = 0; i <= 8; i++) {
                if (cards[t][i]) {
                    cards[t][i] = false;
                    return true;
                }
            }
        }
        return false;
    }
    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int n = in.nextInt();
            int m = in.nextInt();
            String st = in.nextLine();
            int trump = suitToInt(st.charAt(1));
            boolean cards[][] = new boolean [4][9];
            String given = in.nextLine();
            for (int i = 0; i < n; i++) {
                char suit = given.charAt(1 + 3*i);
                char rank = given.charAt(0 + 3*i);
                cards[suitToInt(suit)][rankToInt(rank)] = true;
            }
            String attack = in.nextLine();
            boolean ans = true;
            for (int i = 0; i < m; i++) {
                int suit = suitToInt(attack.charAt(1 + 3*i));
                int rank = rankToInt(attack.charAt(0 + 3*i));
                if (!fight(cards, suit, rank, trump)) {
                    ans = false;
                    break;
                }
            }
            out.println(ans ? "YES" : "NO");
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
