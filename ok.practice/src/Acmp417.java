// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp417 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int nDays = in.nextInt();
        int weekDay = 2;
        int day = 1;
        int month = 1;
        int year = 2008;
        for (int i = 0; i < nDays; i++) {
            int daysFeb;
            if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                daysFeb = 29;
            } else {
                daysFeb = 28;
            }
            int daysMonth;
            if (month == 2) {
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
                month++;
            } else {
                day++;
            }
            if (weekDay < 7) {
                weekDay++;
            } else {
                weekDay = 1;
            }
        }
        if (weekDay == 1) {
            out.print("Monday");
        } else if (weekDay == 2) {
            out.print("Tuesday");
        } else if (weekDay == 3) {
            out.print("Wednesday");
        } else if (weekDay == 4) {
            out.print("Thursday");
        } else if (weekDay == 5) {
            out.print("Friday");
        } else if (weekDay == 6) {
            out.print("Saturday");
        } else if (weekDay == 7) {
            out.print("Sunday");
        } else {
            throw new Error();
        }
        out.println(", " + day / 10 + day % 10 + "." + month / 10 + month % 10);

        // ^^^^^^^^^^
        out.close();
    }
}
