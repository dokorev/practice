// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp501 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int n  = in.nextInt();
        for (int i = 0; i < 4*n; i++) {
            in.nextInt();
        }
        int minX;
        int maxX;
        int minY;
        int maxY;
        {
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();
            minX = Math.min(x1, x2);
            minY = Math.min(y1, y2);
            maxX = Math.max(x1, x2);
            maxY = Math.max(y1, y2);
        }
        in.close();
        try {
            in = new Scanner(new FileReader("input.txt"));
        } catch (IOException e) {
            throw new Error(e);
        }
        in.nextInt();
        int s = 0;
        for(int i = 0; i<n; i++) {
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();
            int minXL = Math.min(x1, x2);
            int maxXL = Math.max(x1, x2);
            int minYL = Math.min(y1, y2);
            int maxYL = Math.max(y1, y2);
            int proX = Math.max(0, Math.min(maxX, maxXL) - Math.max(minX, minXL));
            int proY = Math.max(0, Math.min(maxY, maxYL) - Math.max(minY, minYL));
            s += proX * proY;
        }
        out.println(s);
        // ^^^^^^^^^^
        out.close();
    }
}