// acmp.ru

import java.io.*;
import java.util.*;

public class Acmp639 {
    // functions if needed
    // vvvvvvvvv
    public static class Line {

        final int intRatings;

        final String strRatings;

        final String handle;

        Line(Scanner in) {
            strRatings = in.next();
            handle = in.next();
            intRatings = Integer.parseInt(strRatings.replace(".", ""));
        }
    }
    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int nRooms = in.nextInt();
            List<Line> lines = new ArrayList<>();
            for (int i = 0; i < nRooms; i++) {
                int nMen = in.nextInt();
                for (int j = 0; j < nMen; j++) {
                    lines.add(new Line(in));
                }
            }
            Collections.sort(lines, (left, right) -> right.intRatings - left.intRatings);
            out.println(lines.size());
            for (Line line : lines) {
                out.println(line.strRatings + " " + line.handle);
            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
