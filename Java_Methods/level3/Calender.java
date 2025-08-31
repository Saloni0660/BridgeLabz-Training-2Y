import java.util.Scanner;

public class Calender {

    // Array to store month names
    static String[] months = {
        "January", "February", "March", "April", "May", "June", 
        "July", "August", "September", "October", "November", "December"
    };

    // Array to store days in each month (non-leap year)
    static int[] daysInMonth = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    // Method to check if a year is leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    // Method to get the number of days in a month for a given year
    public static int getNumberOfDays(int month, int year) {
        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        }
        return daysInMonth[month - 1];
    }

    // Method to get the name of the month
    public static String getMonthName(int month) {
        return months[month - 1];
    }

    // Method to calculate the day of the week for 1st of the month using Gregorian calendar algorithm
    // Returns 0 for Sunday, 1 for Monday, ..., 6 for Saturday
    public static int getStartDay(int year, int month) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;
        return d0;
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        System.out.println("\n   " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int startDay = getStartDay(year, month);
        int numDays = getNumberOfDays(month, year);

        // Print leading spaces for first week indentation
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");  // 4 spaces per day
        }

        // Print all the days of the month
        for (int day = 1; day <= numDays; day++) {
            System.out.printf("%3d ", day);

            // Move to next line after Saturday
            if ((startDay + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month entered.");
            return;
        }

        displayCalendar(month, year);
        
        }
    }
}
