class Solution {
    public int rob(int[] nums) {
        int[] tracker = new int[nums.length];

        // Handle empty array
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        if(nums.length == 1){
            return nums[0];

        }
        tracker[0] = nums[0];
        tracker[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i < nums.length; i++){
            tracker[i] = Math.max(nums[i] + tracker[i - 2], tracker[i-1]);

        }
        return tracker[tracker.length - 1];
    }
}