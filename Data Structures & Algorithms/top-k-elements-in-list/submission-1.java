class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        List<int[]> vals = new ArrayList<>();

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            vals.add(new int[] {e.getKey(), e.getValue()});
        }
        vals.sort((a,b) -> Integer.compare(b[1], a[1]));

        int[] res = new int[k];

        for (int i = 0; i < k; i++) {
            res[i] = vals.get(i)[0];
        }
        return res;
    }
}
