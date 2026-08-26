class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Total sum of all elements
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            int leftCount = i;
            int rightCount = n - i - 1;

            int rightSum = totalSum - leftSum - nums[i];

            // Difference from elements on the left
            int leftDifference = nums[i] * leftCount - leftSum;

            // Difference from elements on the right
            int rightDifference = rightSum - nums[i] * rightCount;

            result[i] = leftDifference + rightDifference;

            // Add current element to left side
            leftSum += nums[i];
        }

        return result;
    }
}