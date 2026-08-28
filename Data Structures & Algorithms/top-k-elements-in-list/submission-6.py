class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        m = defaultdict(int)
        for n in nums:
            m[n] += 1
        kfreq = sorted(m.items(), key=lambda x: x[1], reverse=True)
        return [x[0] for x in kfreq[:k]]