class Solution {
    public int rob(int[] nums) {
        // Handle empty array
        if (nums == null || nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }
        return Math.max(robbingRange(nums, 0, nums.length - 2),robbingRange(nums, 1, nums.length - 1));
    }

    public int robbingRange(int[] nums, int start, int end) {

    
        if (start == end) {
            return nums[start];
        }

        int n = end - start +1;
        int[] dp = new int[n];
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start + 1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(nums[start + i] + dp[i - 2],dp[i - 1]);
        }

        return dp[n - 1];
    }
}