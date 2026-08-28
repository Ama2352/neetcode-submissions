class KthLargest {

    PriorityQueue<Integer> minHeap;
    int K;

    public KthLargest(int k, int[] nums) {
        K = k;
        minHeap = new PriorityQueue<>();

        for(int n : nums) {
            minHeap.offer(n);
            if(minHeap.size() > K) {
                minHeap.poll();
            }
        }
    }
    
    public int add(int val) {
        minHeap.offer(val);
        if(minHeap.size() > K) {
            minHeap.poll();
        }

        return minHeap.peek();
    }
}
