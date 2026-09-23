class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < stones.length; i++) {
            maxHeap.add(stones[i]);
        }
        while (!maxHeap.isEmpty()) {
            if (maxHeap.size() == 1) return maxHeap.peek();

            int y = maxHeap.poll();
            int x = maxHeap.poll();

            if (x < y) {
                y = y - x;
                maxHeap.add(y);
            }
        }
        return 0;
    }
}
