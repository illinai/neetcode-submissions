class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        if (nums == null) return 0;

        int curMax = 0;
        int curMin = 0;
        int gMax = nums[0];
        int gMin = nums[0];
        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            curMax = Math.max(nums[i], curMax+nums[i]);
            curMin = Math.min(nums[i], curMin+nums[i]);
            gMax = Math.max(gMax, curMax);
            gMin = Math.min(gMin, curMin);
            total += nums[i];
        }

        if(gMax < 0) return gMax;
        
        return Math.max(total-gMin, gMax);

    }
}