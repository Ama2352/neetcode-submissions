class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        m = defaultdict(int)
        for n in nums:
            m[n] += 1
        minHeap = []
        for key, freq in m.items():
            heapq.heappush(minHeap, (freq, key))
            if len(minHeap) > k:
                heapq.heappop(minHeap)
        return [x[1] for x in minHeap]

            