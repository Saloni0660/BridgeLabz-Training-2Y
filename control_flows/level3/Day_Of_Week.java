public class Day_Of_Week {
    public static void main(String[] args) {
        // Command-line arguments: month day year
        int m = Integer.parseInt(args[0]);  // month
        int d = Integer.parseInt(args[1]);  // day
        int y = Integer.parseInt(args[2]);  // year

        // Formula steps
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Output: 0=Sunday, 1=Monday, ..., 6=Saturday
        System.out.println("Day Number: " + d0);

        // Optional: Print actual day name
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("Day of Week: " + days[d0]);
    }
}
