class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b - a);
        for(int n : stones) {
            maxHeap.offer(n);
        }
        
        while(maxHeap.size() > 1) {
            int x = maxHeap.poll();
            int y = maxHeap.poll();
            int weight = Math.abs(x-y);
            if(weight != 0) maxHeap.offer(weight);
        }

        if(maxHeap.size() == 1) {
            return maxHeap.poll();
        } 

        return 0;
    }
}
