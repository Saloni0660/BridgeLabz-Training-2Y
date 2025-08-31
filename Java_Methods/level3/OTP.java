import java.util.HashSet;
import java.util.Set;

public class OTP {

    // a. Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        // Generate 6 digit number from 100000 to 999999 inclusive
        return 100000 + (int)(Math.random() * 900000);
    }

    // b. Create an array to save OTP numbers generated 10 times
    // c. Write a method to ensure the OTP numbers generated are unique
    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> uniqueSet = new HashSet<>();
        for (int otp : otps) {
            if (!uniqueSet.add(otp)) {
                // Duplicate found
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otpArray[i]);
        }

        // Check if all OTPs are unique
        if (areOTPsUnique(otpArray)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("There are duplicate OTPs.");
        }
    }
}
