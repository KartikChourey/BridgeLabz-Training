public class Height {

    // Generates random heights between 150 cm and 250 cm for 11 players
    public static int[] generateHeights() {
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++)
            heights[i] = 150 + (int)(Math.random() * 101);
        return heights;
    }

    // Finds sum of all heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) sum += h;
        return sum;
    }

    // Calculates mean height
    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    // Finds shortest player height
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights)
            if (h < min) min = h;
        return min;
    }

    // Finds tallest player height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights)
            if (h > max) max = h;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights();

        // Display heights
        for (int h : heights)
            System.out.print(h + " ");

        System.out.println("\nShortest: " + findShortest(heights));
        System.out.println("Tallest: " + findTallest(heights));
        System.out.println("Mean Height: " + findMean(heights));
    }
}
