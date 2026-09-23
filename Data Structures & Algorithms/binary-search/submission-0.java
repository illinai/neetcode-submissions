class Solution {
    public int bSearch(int[] nums, int target, int start, int end) {
        if (start > end) return -1;
        int middle = (start + end) / 2;
        if (nums[middle] == target) {
            return middle;
        }
        if (nums[middle] > target) {
            return bSearch (nums, target, start, middle-1);
        }
        if (nums[middle] < target) {  
            return bSearch (nums, target, middle+1, end);
        }
        return -1;
    }
    public int search (int[] nums, int target) {
        return bSearch(nums, target, 0, nums.length-1);
    }
}
