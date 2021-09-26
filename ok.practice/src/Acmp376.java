// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp376 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int birthDay = in.nextInt();
        int birthMonth = in.nextInt();
        int day = in.nextInt();
        int month = in.nextInt();
        int year = in.nextInt();
        int count = 0;
        while (!(day == birthDay && month == birthMonth)) {
            int dif;
            if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                dif = 29;
            } else {
                dif = 28;
            }
            int dim;
            if (month == 2) {
                dim = dif;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                dim = 30;
            } else {
                dim = 31;
            }
            if (day  == 31 && month == 12) {
                day = 1;
                month = 1;
                year++;
            } else if (day == dim) {
                day = 1;
                month++;
            } else {
                day++;
            }
            count ++;
        }
        out.println(count);

        // ^^^^^^^^^^
        out.close();
    }
}
