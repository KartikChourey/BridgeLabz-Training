class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int ans = 0; // Initialize answer
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[ans] = nums[i]; // Move the non-val element to the front
                ans++; // Increment count of non-val elements
            }
        }
        return ans; // Return count
    }
}