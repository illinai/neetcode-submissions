class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        List<int[]> output = new ArrayList<>();
        output.add(intervals[0]);

        for (int[] inter : intervals) {
            int start = inter[0];
            int end = inter[1];
            int lastend = output.get(output.size() - 1)[1];

            if (start <= lastend) {
                output.get(output.size() - 1)[1] = Math.max(lastend, end);
            } else {
                output.add(new int[]{start, end});
            }
        }
        return output.toArray(new int[output.size()][]);
    }
}
