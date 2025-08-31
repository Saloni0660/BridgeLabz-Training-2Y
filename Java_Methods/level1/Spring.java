public class Spring {

    // Method to check if given month and day fall in spring season
    public static boolean isSpringSeason(int month, int day) {
        if (month < 3 || month > 6) {
            return false;
        } else if (month == 3 && day < 20) {
            return false;
        } else if (month == 6 && day > 20) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide month and day as command line arguments.");
            return;
        }

        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
