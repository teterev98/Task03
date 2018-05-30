public class NextDay {
    public static void main(String[] args) {
    }

    public static final int MONTH_DAYS_30 = 30;
    public static final int MONTH_DAYS_31 = 31;
    public static final int FEBRUARY_NORMAL = 28;
    public static final int FEBRUARY_LEAP = 29;

    public static boolean chekLeapYear(int year) {

        return !(year % 4 != 0 || (year % 100 == 0 && year % 400 != 0));

    }

    public static void outNextDay(int day, int month, int year) {
        int lastday = getLastDay(month, year);
        int nextdayday;
        int nextdaymonth;
        int nextdayyear;
        if (ckekdate(day, month, lastday)) {
            if (day < lastday) {
                nextdayday = day + 1;
                nextdaymonth = month;
                nextdayyear = year;
            } else if (month < 12) {
                nextdayday = 1;
                nextdaymonth = month + 1;
                nextdayyear = year;
            } else {
                nextdayday = 1;
                nextdaymonth = 1;
                nextdayyear = year + 1;
            }
            System.out.printf("Your date is %d.%d.%d  ----- Next day is %d.%d.%d \n",
                    day, month, year, nextdayday, nextdaymonth, nextdayyear);
        }
        else {
            System.out.println("Invalide date");
        }
    }

    public static int getLastDay(int month, int year) {
        int lastday = 0;
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12) {
            lastday = MONTH_DAYS_31;
        } else if (month != 2) {
            lastday = MONTH_DAYS_30;
        } else if (chekLeapYear(year)) {
            lastday = FEBRUARY_LEAP;
        } else lastday = FEBRUARY_NORMAL;
        return lastday;
    }

    public static boolean ckekdate(int day, int month, int lastday) {
        return !(day > lastday || month < 1 || month > 12);
    }

}
