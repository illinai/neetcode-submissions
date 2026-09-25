class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        threshold *= k;
        int res = 0;
        int curSum = 0;

        for (int R = 0; R < arr.length; R++) {
            curSum += arr[R];
            if (R >= k-1) {
                if (curSum >= threshold) {
                    res++;
                }
                curSum -= arr[R - k + 1];
            }
        }
        return res;
    }
}