public class FitnessTracker {

    public static void main(String[] args) {

        // Push-ups done each day (0 means rest day)
        int[] pushUps = {30, 0, 25, 40, 0, 35, 20};

        int total = 0;
        int activeDays = 0;

        System.out.println("Sandeep's Weekly Fitness Report");

        // for-each loop
        for (int count : pushUps) {

            // Skip rest days
            if (count == 0) {
                continue;
            }

            total += count;
            activeDays++;
        }

        double average = (activeDays > 0) ? (double) total / activeDays : 0;

        System.out.println("Total Push-ups (excluding rest days): " + total);
        System.out.println("Active Workout Days: " + activeDays);
        System.out.println("Average Push-ups per Active Day: " + average);
    }
}
