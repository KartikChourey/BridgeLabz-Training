public class OTP {

    // Generates a 6-digit OTP
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }

    // Checks if all OTPs are unique
    public static boolean isUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++)
            for (int j = i + 1; j < otps.length; j++)
                if (otps[i] == otps[j]) return false;
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        // Generate OTPs
        for (int i = 0; i < 10; i++)
            otps[i] = generateOTP();

        System.out.println("All OTPs Unique: " + isUnique(otps));
    }
}
