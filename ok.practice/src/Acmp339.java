// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp339 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        in.useDelimiter("\\.\\s+");
        int day = in.nextInt();
        int month = in.nextInt();
        int year = in.nextInt();
        int endDay = in.nextInt();
        int endMonth = in.nextInt();
        int endYear = in.nextInt();
        int count = 2;
        while (!(day == endDay && month == endMonth && year == endYear)) {
            int daysFeb;
            if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                daysFeb = 29;
            } else {
                daysFeb = 28;
            }
            int daysMonth;
            if(month == 2) {
                daysMonth = daysFeb;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                daysMonth = 30;
            } else {
                daysMonth = 31;
            }
            if (day == 31 && month == 12) {
                day = 1;
                month = 1;
                year++;
            } else if (day == daysMonth) {
                day = 1;
                month ++;
            } else {
                day++;
            }
            count++;
        }
        out.println(count);
        // ^^^^^^^^^^
        out.close();
    }
}
