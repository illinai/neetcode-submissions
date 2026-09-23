class Solution {
    public int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            if (i == arr.length-1){
                arr[i] = -1;
            } else {
                int max = 0;
                int curr = 0;
                for (int j = i+1; j < arr.length; j++){
                    curr = arr[j];
                    max = Math.max(max, curr);
                }
                arr[i] = max;
            }
        }
        return arr;
    }
}