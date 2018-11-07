package funstuff;

public class Zeller {

    public static int dayOfWeek(int day, int month, int year) {
        int mMonth = month;
        int mYear = year;

        if (month < 3) {
            mMonth = mMonth + 12;
            mYear = mYear - 1;
        }
        return (day + (13 * (mMonth + 1) / 5) + mYear + mYear/4 - mYear/100 + mYear/400) % 7;
    }

    public static void main(String[] args) {
        int day = 1;
        int month = 1;
        int year = 2000;

        int dayOfWeek = dayOfWeek(day, month, year);
        System.out.println("Day number is " + dayOfWeek);

        System.out.println("Day number is " + dayOfWeek(7, 11, 2018));
        System.out.println("Day number is " + dayOfWeek(6, 11, 2018));
        System.out.println("Day number is " + dayOfWeek(1, 1, 2018));
    }
}
